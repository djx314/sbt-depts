package djx.sbt.depts.abs

import java.io.File
import java.nio.file.Paths
import scala.collection.compat._

package impl {
  class DeptSettingContext {
    private var settings: List[LibraryDepts.LibraryDeptsSettings] = List.empty
    def push(item: LibraryDepts.LibraryDeptsSettings): Unit = settings = settings ::: item :: List.empty[LibraryDepts.LibraryDeptsSettings]
    def value: List[LibraryDepts.LibraryDeptsSettings]      = settings
  }

  class ScalaVersionVarSetting(context: DeptSettingContext) {
    def :=(s: String): Unit = context.push(LibraryDepts.ScalaVersionSingleSettings(s))
  }

  class StringLibAppend(prefix: LibraryDepts.LibraryInstance) {
    def %%%(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.TextType.LitText("%%%")),
      current = LibraryDepts.TextType.StringText(s)
    )
    def %%(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.TextType.LitText("%%")),
      current = LibraryDepts.TextType.StringText(s)
    )
    def %(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.TextType.LitText("%")),
      current = LibraryDepts.TextType.StringText(s)
    )
    def %(s: LibraryDepts.TextType): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.TextType.LitText("%")),
      current = s
    )
    def cross(s: LibraryDepts.CrossVersionSetting): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.TextType.LitText("cross")),
      current = s.textType
    )
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
    def +=(v: LibraryDepts.LibraryInstance): Unit = context.push(LibraryDepts.AddLibrarySettings(v))
  }
}

trait LibraryDepts {
  implicit class StringLibMethods1(variable: String)
      extends impl.StringLibAppend(LibraryDepts.LinkAppend(LibraryDepts.LinkZero, LibraryDepts.TextType.StringText(variable)))
  implicit class StringLibMethods2(variable: LibraryDepts.LibraryInstance) extends impl.StringLibAppend(variable)

  val context: impl.DeptSettingContext                         = new impl.DeptSettingContext
  val scalaVersion: impl.ScalaVersionVarSetting                = new impl.ScalaVersionVarSetting(context)
  val VarContext: impl.VarContextSetting                       = new impl.VarContextSetting(context)
  val libraryDependencies: impl.LibraryDependenciesSetting     = new impl.LibraryDependenciesSetting(context)
  def addCompilerPlugin(v: LibraryDepts.LibraryInstance): Unit = context.push(LibraryDepts.AddLibrarySettings(v))

  val CrossVersion: LibraryDepts.CrossVersionSetting.type = LibraryDepts.CrossVersionSetting
  val Test: LibraryDepts.TextType                         = LibraryDepts.TextType.LitText("Test")
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
  case class ScalaVersionSingleSettings(v: String)  extends LibraryDeptsSettings
  case class ChangeDeptVarSettings(v: String)       extends LibraryDeptsSettings
  case class AddLibrarySettings(v: LibraryInstance) extends LibraryDeptsSettings
  case class ChangeScalaVerionSetting(v: String)    extends LibraryDeptsSettings

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
