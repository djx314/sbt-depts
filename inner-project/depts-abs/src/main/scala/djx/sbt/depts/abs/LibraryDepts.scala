package djx.sbt.depts.abs

import com.typesafe.config.{Config, ConfigFactory}

import java.io.File
import java.nio.file.Paths

package impl {
  class DeptSettingContext {
    private var settings: List[LibraryDepts.LibraryDeptsSettings] = List.empty
    def push(item: LibraryDepts.LibraryDeptsSettings): Unit       = settings = settings.appended(item)
    def value: List[LibraryDepts.LibraryDeptsSettings]            = settings
  }

  class ScalaVersionVarSetting(context: DeptSettingContext) {
    def :=(s: String): Unit = context.push(LibraryDepts.ScalaVersionSingleSettings(s))
  }

  class CrossScalaVersionsVarSetting(context: DeptSettingContext) {
    def :=(s: Seq[String]): Unit = context.push(LibraryDepts.CrossScalaVersionsSettings(s))
  }

  class StringLibAppend(prefix: LibraryDepts.LibraryInstance) {
    def %%%(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.LitText("%%%")),
      current = LibraryDepts.StringText(s)
    )
    def %%(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.LitText("%%")),
      current = LibraryDepts.StringText(s)
    )
    def %(s: String): LibraryDepts.LinkAppend = LibraryDepts.LinkAppend(
      prefix = LibraryDepts.LinkAppend(prefix = prefix, current = LibraryDepts.LitText("%")),
      current = LibraryDepts.StringText(s)
    )
  }

  class VarContextSetting(context: DeptSettingContext) {
    def changeDeptVar: VarContextSettingChangeDeptVar = new VarContextSettingChangeDeptVar(context)
  }
  class VarContextSettingChangeDeptVar(context: DeptSettingContext) {
    def :=(v: String): Unit = context.push(LibraryDepts.ChangeDeptVarSettings(v))
  }

  class LibraryDependenciesSetting(context: DeptSettingContext) {
    def +=(v: LibraryDepts.LibraryInstance): Unit = context.push(LibraryDepts.AddLibrarySettings(v))
  }
}

trait LibraryDepts {
  implicit class StringLibMethods1(variable: String)                       extends impl.StringLibAppend(LibraryDepts.LinkZero(variable))
  implicit class StringLibMethods2(variable: LibraryDepts.LibraryInstance) extends impl.StringLibAppend(variable)

  val context: impl.DeptSettingContext                      = new impl.DeptSettingContext
  val scalaVersion: impl.ScalaVersionVarSetting             = new impl.ScalaVersionVarSetting(context)
  val crossScalaVersions: impl.CrossScalaVersionsVarSetting = new impl.CrossScalaVersionsVarSetting(context)
  val VarContext: impl.VarContextSetting                    = new impl.VarContextSetting(context)
  val libraryDependencies: impl.LibraryDependenciesSetting  = new impl.LibraryDependenciesSetting(context)
}

object LibraryDepts {
  sealed trait LibraryDeptsSettings
  case class ScalaVersionSingleSettings(v: String)             extends LibraryDeptsSettings
  case class CrossScalaVersionsSettings(versions: Seq[String]) extends LibraryDeptsSettings
  case class ChangeDeptVarSettings(v: String)                  extends LibraryDeptsSettings
  case class AddLibrarySettings(v: LibraryInstance)            extends LibraryDeptsSettings

  sealed trait LibraryInstance
  case class LinkZero(zeroString: String)                           extends LibraryInstance
  case class LinkAppend(prefix: LibraryInstance, current: TextType) extends LibraryInstance

  sealed trait TextType
  case class LitText(s: String)    extends TextType
  case class StringText(s: String) extends TextType
}
