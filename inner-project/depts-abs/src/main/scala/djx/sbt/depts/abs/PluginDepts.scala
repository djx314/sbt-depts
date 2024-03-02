package djx.sbt.depts.abs

import java.io.File
import java.nio.file.Paths

package pluginImpl {
  class DeptSettingContext {
    private var settings: List[PluginDepts.LibraryDeptsSettings] = List.empty
    def push(item: PluginDepts.LibraryDeptsSettings): Unit = settings = settings ::: item :: List.empty[PluginDepts.LibraryDeptsSettings]
    def value: List[PluginDepts.LibraryDeptsSettings]      = settings
  }

  class StringLibAppend(prefix: PluginDepts.LibraryInstance) {
    def %%%(s: String): PluginDepts.LinkAppend = PluginDepts.LinkAppend(
      prefix = PluginDepts.LinkAppend(prefix = prefix, current = PluginDepts.TextType.LitText("%%%")),
      current = PluginDepts.TextType.StringText(s)
    )
    def %%(s: String): PluginDepts.LinkAppend = PluginDepts.LinkAppend(
      prefix = PluginDepts.LinkAppend(prefix = prefix, current = PluginDepts.TextType.LitText("%%")),
      current = PluginDepts.TextType.StringText(s)
    )
    def %(s: String): PluginDepts.LinkAppend = PluginDepts.LinkAppend(
      prefix = PluginDepts.LinkAppend(prefix = prefix, current = PluginDepts.TextType.LitText("%")),
      current = PluginDepts.TextType.StringText(s)
    )
  }

  class VarContextSetting(context: DeptSettingContext) {
    def changePluginVar: VarContextSetting.VarContextSettingChangeDeptVar = new VarContextSetting.VarContextSettingChangeDeptVar(context)
  }

  object VarContextSetting {
    class VarContextSettingChangeDeptVar(context: DeptSettingContext) {
      def :=(v: String): Unit = context.push(PluginDepts.ChangeDeptVarSettings(v))
    }
  }

  class LibraryDependenciesSetting(context: DeptSettingContext) {
    def +=(v: PluginDepts.LibraryInstance): Unit = context.push(PluginDepts.AddLibrarySettings(v))
  }
}

trait PluginDepts {
  implicit class StringLibMethods1(variable: String)
      extends pluginImpl.StringLibAppend(PluginDepts.LinkAppend(PluginDepts.LinkZero, PluginDepts.TextType.StringText(variable)))
  implicit class StringLibMethods2(variable: PluginDepts.LibraryInstance) extends pluginImpl.StringLibAppend(variable)

  val context: pluginImpl.DeptSettingContext                     = new pluginImpl.DeptSettingContext
  val VarContext: pluginImpl.VarContextSetting                   = new pluginImpl.VarContextSetting(context)
  val libraryDependencies: pluginImpl.LibraryDependenciesSetting = new pluginImpl.LibraryDependenciesSetting(context)
  def addSbtPlugin(v: PluginDepts.LibraryInstance): Unit         = context.push(PluginDepts.AddLibrarySettings(v))
}

object PluginDepts {
  sealed trait LibraryDeptsSettings
  case class ChangeDeptVarSettings(v: String)       extends LibraryDeptsSettings
  case class AddLibrarySettings(v: LibraryInstance) extends LibraryDeptsSettings

  sealed trait LibraryInstance {
    def genString: String
  }
  case object LinkZero extends LibraryInstance {
    override def genString: String = ""
  }
  case class LinkAppend(prefix: LibraryInstance, current: TextType) extends LibraryInstance {
    override def genString: String = s"${prefix.genString} ${current.genString}"
  }

  sealed trait TextType {
    def genString: String
  }
  object TextType {
    case class LitText(s: String) extends TextType {
      override def genString: String = s"$s"
    }
    case class StringText(s: String) extends TextType {
      override def genString: String = "\"\"\"" + s ++ "\"\"\""
    }
  }
}
