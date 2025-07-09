package djx.sbt.depts.plugins

import cats._
import cats.implicits._
import net.scalax.simple.adt.{TypeAdt => Adt}
import java.io.File

object pUtils {

  import djx.sbt.depts.abs.TakeSbtProperties

  def sbtLaunchJarFile: (TakeSbtProperties.Extra3, File) = {
    import coursier._

    val vModel: TakeSbtProperties.Extra3 = djx.sbt.depts.codegen.SbtVersionInfo
    val libOrg                           = Organization(vModel.org)
    val libName                          = ModuleName(vModel.libName)
    val libVersion                       = vModel.version

    val dept: Dependency = Dependency(Module(organization = libOrg, name = libName), version = libVersion)

    val Seq(headFile): Seq[File] = Fetch().addDependencies(dept).run()
    (vModel, headFile)
  }

  val initializeInstanceMonad: Monad[sbt.Def.Initialize] = new StackSafeMonad[sbt.Def.Initialize] {
    override def flatMap[A, B](fa: sbt.Def.Initialize[A])(f: A => sbt.Def.Initialize[B]): sbt.Def.Initialize[B] =
      sbt.std.InitializeInstance.flatten(sbt.std.InitializeInstance.map(fa, f))
    override def pure[A](x: A): sbt.Def.Initialize[A] = sbt.std.InitializeInstance.pure(() => x)
  }

  val sourcePosition: sbt.internal.util.SourcePosition.type = sbt.internal.util.SourcePosition

  class task(implicit m: Monad[sbt.Def.Initialize]) {
    def appendItemToSeq[T](s: sbt.TaskKey[Seq[T]])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[sbt.Task[Seq[T]]] =
      appendItemToSeqImpl(s)(sbt.std.FullInstance.pure(value))(lp)

    def appendItemToSeqImpl[T](s: sbt.TaskKey[Seq[T]])(value: sbt.Def.Initialize[sbt.Task[T]])(
      lp: sbt.SourcePosition
    ): sbt.Def.Setting[sbt.Task[Seq[T]]] = s.append1(value, lp)
  }

  object task extends task()(initializeInstanceMonad)

  class setting(implicit m: Monad[sbt.Def.Initialize]) {
    class SetKeyContext[T](sKey: sbt.SettingKey[T], lp: sbt.SourcePosition) {
      def value[U: Adt.CoProducts2[*, T, sbt.Def.Initialize[T]]](u: U): sbt.Def.Setting[T] = {
        val applyM = Adt.CoProduct2[T, sbt.Def.Initialize[T]](u)
        val initT  = applyM.fold(t => t.pure[sbt.Def.Initialize])(identity)
        sKey.set(initT, lp)
      }

      def setIfNone[U: Adt.CoProducts3[*, () => T, T, sbt.Def.Initialize[T]]](default: U): sbt.Def.Setting[T] = {
        val applyM = Adt.CoProduct3[() => T, T, sbt.Def.Initialize[T]](default)
        val defaultValue: sbt.Def.Initialize[() => T] =
          applyM.fold(t => t.pure[sbt.Def.Initialize])(t => (() => t).pure[sbt.Def.Initialize])(t => for (d <- t) yield () => d)

        val aa: sbt.Def.Initialize[Option[T]] = sKey.?

        val bb = for {
          aaInner <- aa
          d       <- defaultValue
        } yield aaInner.getOrElse(d())

        setKey(sKey)(lp).value(bb)
      }
    }
    class SetKeySeqContext[T](sKey: sbt.SettingKey[Seq[T]], lp: sbt.SourcePosition) {
      def appendOneOrMore[U: Adt.CoProducts4[*, T, sbt.Def.Initialize[T], Seq[T], sbt.Def.Initialize[Seq[T]]]](
        u: U
      ): sbt.Def.Setting[Seq[T]] = {
        val applyM = Adt.CoProduct4[T, sbt.Def.Initialize[T], Seq[T], sbt.Def.Initialize[Seq[T]]](u)

        type Opt2 = Adt.CoProduct2[sbt.Def.Initialize[T], sbt.Def.Initialize[Seq[T]]]
        val Opt2Apply: Adt.CoProduct2Apply[sbt.Def.Initialize[T], sbt.Def.Initialize[Seq[T]]] =
          Adt.CoProduct2[sbt.Def.Initialize[T], sbt.Def.Initialize[Seq[T]]]

        val applyM1: Opt2 = applyM.fold
          .apply(t => Opt2Apply.option1(t.pure[sbt.Def.Initialize]))
          .apply(t => Opt2Apply.option1(t))
          .apply(t => Opt2Apply.option2(t.pure[sbt.Def.Initialize]))
          .apply(t => Opt2Apply.option2(t))

        applyM1.fold(x1 => sKey.append1(x1, lp))(x2 => sKey.appendN(x2, lp))
      }
    }

    def setKey[T](sKey: sbt.SettingKey[T])(lp: sbt.SourcePosition): SetKeyContext[T]            = new SetKeyContext(sKey, lp)
    def setKeySeq[T](sKey: sbt.SettingKey[Seq[T]])(lp: sbt.SourcePosition): SetKeySeqContext[T] = new SetKeySeqContext(sKey, lp)

  }

  object setting extends setting()(initializeInstanceMonad)
  import scala.language.experimental.macros

  object SeeTree {
    def see[U](p: U): U = macro impl.SeeTreeImpl.see[U]
  }

}

package impl {
  import scala.reflect.macros.blackbox.Context

  object SeeTreeImpl {
    def see[U: c.WeakTypeTag](c: Context)(p: c.Expr[U]): c.Expr[U] = {
      println(p.tree)
      p
    }
  }
}
