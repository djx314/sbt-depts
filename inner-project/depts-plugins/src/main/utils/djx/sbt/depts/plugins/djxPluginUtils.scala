package djx.sbt.depts.plugins

object pUtils extends pUtils

trait pUtils {

  val sourcePosition: sbt.internal.util.SourcePosition.type = sbt.internal.util.SourcePosition

  object task {
    def appendItemToSeq[T](s: sbt.TaskKey[Seq[T]])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[sbt.Task[Seq[T]]] = {
      s.append1(sbt.std.FullInstance.pure(value), lp)(implicitly)
    }
  }

  object setting {
    def setConst[T](sKey: sbt.SettingKey[T])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[T] = {
      val initInstance                        = sbt.std.InitializeInstance
      val initSettings: sbt.Def.Initialize[T] = initInstance.pure[T](value)
      sKey.set(initSettings, lp)
    }

    def addScalaJsLibrary(sKey: sbt.SettingKey[Seq[sbt.ModuleID]])(value: () => (String, String, String))(lp: sbt.SourcePosition): sbt.Def.Setting[Seq[sbt.ModuleID]] = {
      sbt.Keys.libraryDependencies.append1[sbt.ModuleID](
        sbt.std.InitializeInstance.map[sbt.CrossVersion, sbt.librarymanagement.ModuleID](
          org.portablescala.sbtplatformdeps.PlatformDepsGroupID.platformDepsCrossVersion,
          (crossVersionInfo: sbt.CrossVersion) =>
            org.portablescala.sbtplatformdeps.PlatformDepsGroupID
              .withCross(
                org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport.toPlatformDepsGroupID("aa"),
                "bb",
                crossVersionInfo
              )
              .%("cc")
        ),
        sourcePosition.fromEnclosing()
      )(sbt.Append.appendSeq[sbt.ModuleID, sbt.ModuleID]): sbt.Def.Setting[Seq[sbt.librarymanagement.ModuleID]]
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
