package djx.sbt.depts.plugins

object djxPluginUtils {

  val sourcePosition: sbt.internal.util.SourcePosition.type = sbt.internal.util.SourcePosition

  object settingKeyObj {
    def setConst[T](sKey: sbt.SettingKey[T])(value: () => T)(lp: sbt.SourcePosition): sbt.Def.Setting[T] = {
      val initInstance                        = sbt.std.InitializeInstance
      val initSettings: sbt.Def.Initialize[T] = initInstance.pure[T](value)
      sKey.set(initSettings, lp)
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
