package djx.sbt.depts.abs
package abc11

import java.io.File
import java.nio.file.Paths
import sbt.librarymanagement._

package impl {
  class DeptSettingContext {
    private var settings: List[LibraryDepts.LibraryDeptsSettings] = List.empty
    def push(item: LibraryDepts.LibraryDeptsSettings): Unit = settings = settings ::: item :: List.empty[LibraryDepts.LibraryDeptsSettings]
    def value: List[LibraryDepts.LibraryDeptsSettings]      = settings
  }

  class ScalaVersionVarSetting(context: DeptSettingContext) {
    def :=(s: String): Unit = context.push(LibraryDepts.ScalaVersionSingleSettings(s))
  }

  class VarContextSetting(context: DeptSettingContext) {
    def changeDeptVar: VarContextSetting.VarContextSettingChangeDeptVar = new VarContextSetting.VarContextSettingChangeDeptVar(context)
    def setScalaVersion: VarContextSetting.VarContextScalaVersionChangedVar =
      new VarContextSetting.VarContextScalaVersionChangedVar(context)
  }

  object VarContextSetting {
    class VarContextSettingChangeDeptVar(context: DeptSettingContext) {
      def :=(v: String): Unit = context.push(LibraryDepts.ChangeDeptVarSettings(v))
    }
    class VarContextScalaVersionChangedVar(context: DeptSettingContext) {
      def :=(v: String): Unit = context.push(LibraryDepts.ChangeScalaVerionSetting(v))
    }
  }

  class LibraryDependenciesSetting(context: DeptSettingContext) {
    def +=(v: ModuleID): Unit = context.push(LibraryDepts.AddLibrarySettings(v))
  }
}

trait LibraryDepts {
  val context: impl.DeptSettingContext                     = new impl.DeptSettingContext
  val scalaVersion: impl.ScalaVersionVarSetting            = new impl.ScalaVersionVarSetting(context)
  val VarContext: impl.VarContextSetting                   = new impl.VarContextSetting(context)
  val libraryDependencies: impl.LibraryDependenciesSetting = new impl.LibraryDependenciesSetting(context)
  def addCompilerPlugin(v: ModuleID): Unit                 = context.push(LibraryDepts.AddLibrarySettings(v))
}

object LibraryDepts {
  sealed trait CrossVersionSetting {
    def textType: TextType
  }
  object CrossVersionSetting {
    case object full extends CrossVersionSetting {
      override def textType: TextType = TextType.LitText("CrossVersion.full")
    }
  }

  sealed trait LibraryDeptsSettings
  case class ScalaVersionSingleSettings(v: String) extends LibraryDeptsSettings
  case class ChangeDeptVarSettings(v: String)      extends LibraryDeptsSettings
  case class AddLibrarySettings(v: ModuleID)       extends LibraryDeptsSettings
  case class ChangeScalaVerionSetting(v: String)   extends LibraryDeptsSettings

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
      override def genString: String = s
    }
    case class StringText(s: String) extends TextType {
      override def genString: String = "\"\"\"" + s + "\"\"\""
    }
  }
}
