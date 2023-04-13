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
    def %%%(s: String): LibraryDepts.LibraryInstance = prefix.appendString(s).appendLiftType(LibraryDepts.TextType.LiftToScalaJs)
    def %%(s: String): LibraryDepts.LibraryInstance  = prefix.appendString(s).appendLiftType(LibraryDepts.TextType.LiftToScala)
    def %(s: String): LibraryDepts.LibraryInstance   = prefix.appendString(s)
    def %(s: LibraryDepts.ScopeType): LibraryDepts.LibraryInstance               = prefix.appendScope(s)
    def cross(s: LibraryDepts.CrossVersionSetting): LibraryDepts.LibraryInstance = prefix.appendCrossVersionSetting(s)
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
  implicit class StringLibMethods1(variable: String) extends impl.StringLibAppend(LibraryDepts.LibraryInstance.init.appendString(variable))
  implicit class StringLibMethods2(variable: LibraryDepts.LibraryInstance) extends impl.StringLibAppend(variable)

  val context: impl.DeptSettingContext                     = new impl.DeptSettingContext
  val scalaVersion: impl.ScalaVersionVarSetting            = new impl.ScalaVersionVarSetting(context)
  val VarContext: impl.VarContextSetting                   = new impl.VarContextSetting(context)
  val libraryDependencies: impl.LibraryDependenciesSetting = new impl.LibraryDependenciesSetting(context)
  def addCompilerPlugin(v: LibraryDepts.LibraryInstance): Unit =
    context.push(LibraryDepts.AddLibrarySettings(v.appendScope(LibraryDepts.ScopeType.CompilePlugin)))

  val CrossVersion: LibraryDepts.CrossVersionSetting.type = LibraryDepts.CrossVersionSetting
  val Test: LibraryDepts.ScopeType                        = LibraryDepts.ScopeType.Test
}

object LibraryDepts {
  sealed trait CrossVersionSetting {
    def textType: String
  }
  object CrossVersionSetting {
    case object full extends CrossVersionSetting {
      override val textType: String = "CrossVersion.full"
    }
  }

  sealed trait ScopeType {
    def textType: String
  }
  object ScopeType {
    case object Test extends ScopeType {
      override val textType: String = "Test"
    }
    case object CompilePlugin extends ScopeType {
      override val textType: String = "CompilePlugin"
    }
  }

  sealed trait LibraryDeptsSettings
  case class ScalaVersionSingleSettings(v: String)  extends LibraryDeptsSettings
  case class ChangeDeptVarSettings(v: String)       extends LibraryDeptsSettings
  case class AddLibrarySettings(v: LibraryInstance) extends LibraryDeptsSettings
  case class ChangeScalaVerionSetting(v: String)    extends LibraryDeptsSettings

  case class LibraryInstance(
    name1: String,
    name2: String,
    name3: String,
    liftType: TextType,
    crossVersionSetting: Option[CrossVersionSetting],
    scope: Option[ScopeType]
  ) {
    def appendString(n: String): LibraryInstance = if (name1.size == 0) copy(name1 = n)
    else if (name2.size == 0) copy(name2 = n)
    else if (name3.size == 0) copy(name3 = n)
    else this

    def appendLiftType(n: TextType): LibraryInstance = copy(liftType = n)

    def appendCrossVersionSetting(v: CrossVersionSetting): LibraryInstance = copy(crossVersionSetting = Option(v))

    def appendScope(v: ScopeType): LibraryInstance = copy(scope = Option(v))
  }

  object LibraryInstance {
    val init: LibraryInstance = LibraryInstance(
      name1 = "",
      name2 = "",
      name3 = "",
      liftType = TextType.LiftToJava,
      crossVersionSetting = Option.empty,
      scope = Option.empty
    )
  }

  sealed trait TextType {
    def genString: String
  }
  object TextType {
    case object LiftToJava extends TextType {
      override def genString: String = "\"\"\"" + LiftToJava.getClass.getName + "\"\"\""
    }
    case object LiftToScala extends TextType {
      override def genString: String = "\"\"\"" + LiftToScala.getClass.getName + "\"\"\""
    }
    case object LiftToScalaJs extends TextType {
      override def genString: String = "\"\"\"" + LiftToScalaJs.getClass.getName + "\"\"\""
    }
  }
}
