package djx.sbt.depts.plugins

import cats._
import cats.implicits._
import cats.syntax._
import sbt.librarymanagement.ModuleID

object pUtils extends pUtils

trait pUtils {

  implicit val initializeInstanceMonad: StackSafeMonad[sbt.Def.Initialize] = new StackSafeMonad[sbt.Def.Initialize] {
    override def flatMap[A, B](fa: sbt.Def.Initialize[A])(f: A => sbt.Def.Initialize[B]): sbt.Def.Initialize[B] =
      sbt.std.InitializeInstance.flatten(sbt.std.InitializeInstance.map(fa, f))
    override def pure[A](x: A): sbt.Def.Initialize[A] = sbt.std.InitializeInstance.pure(() => x)
  }

  val sourcePosition: sbt.internal.util.SourcePosition.type = sbt.internal.util.SourcePosition

  object task {
    def appendItemToSeq[T](s: sbt.TaskKey[Seq[T]])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[sbt.Task[Seq[T]]] = {
      s.append1(sbt.std.FullInstance.pure(value), lp)
    }
  }

  object setting {
    def setConst[T](sKey: sbt.SettingKey[T])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[T] = {
      val initInstance                        = sbt.std.InitializeInstance
      val initSettings: sbt.Def.Initialize[T] = initInstance.pure[T](value)
      sKey.set(initSettings, lp)
    }

    def addScalaJsLibraryImpl(
      sKey: sbt.SettingKey[Seq[sbt.ModuleID]]
    )(
      bindKey: sbt.SettingKey[sbt.CrossVersion]
    )(value: () => (String, String, String))(lp: sbt.SourcePosition): sbt.Def.Setting[Seq[sbt.ModuleID]] = {
      val (moduleOrg, moduleName, version) = value()

      import org.portablescala.sbtplatformdeps.{PlatformDepsPlugin, PlatformDepsGroupID}
      import PlatformDepsPlugin.autoImport._
      val newModuleOrg: PlatformDepsGroupID = moduleOrg

      def newModuleName(v: sbt.CrossVersion): sbt.ModuleID = {
        val modulePrefix = org.portablescala.sbtplatformdeps.PlatformDepsGroupID.withCross(newModuleOrg, moduleName, v)
        modulePrefix % version
      }

      /*val aa = sbt.std.InitializeInstance.map[sbt.CrossVersion, sbt.librarymanagement.ModuleID](
        bindKey,
        (crossVersionInfo: sbt.CrossVersion) => newModuleName(crossVersionInfo)
      )*/

      val moduleIDCompat = Monad[sbt.Def.Initialize].map(bindKey)(crossVersionInfo => newModuleName(crossVersionInfo))

      sKey.append1(moduleIDCompat, lp)
    }

    def addScalaJsLibrary(
      sKey: sbt.SettingKey[Seq[sbt.ModuleID]]
    )(value: () => (String, String, String))(lp: sbt.SourcePosition): sbt.Def.Setting[Seq[sbt.ModuleID]] = {
      val bindKey = org.portablescala.sbtplatformdeps.PlatformDepsGroupID.platformDepsCrossVersion
      addScalaJsLibraryImpl(sKey)(bindKey)(value)(lp)
    }
  }

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
