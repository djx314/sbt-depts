package djx.sbt.depts.abs

import scala.collection.compat._
import models.{CrossInfo, DeptInfo, DeptType, ScalaJavaVersion}
import net.scalax.simple.adt.{TypeAdt => Adt}

class DeptsModuleHelper1(org: String, name: String, platform: DeptType.Type) {
  DeptMHelperSelf =>

  def %(version: String): DeptsModule = DeptsModule(
    org = DeptMHelperSelf.org,
    name = DeptMHelperSelf.name,
    platform = DeptMHelperSelf.platform,
    version = version,
    info = DeptInfo.Library,
    crossInfo = CrossInfo.NoCrossVersion
  )
}

// ===
case class DeptsModule(
  org: String,
  name: String,
  platform: DeptType.Type,
  version: String,
  info: DeptInfo.Type,
  crossInfo: CrossInfo.Type
) {
  DeptsModuleSelf =>

  def cross(otherCrossInfo: CrossInfo.Type): DeptsModule = DeptsModuleSelf.copy(crossInfo = otherCrossInfo)
  def toScalaJavaVersion(sjVersion: ScalaJavaVersion.Type): DeptsWithVersionModel =
    DeptsWithVersionModel(dept = DeptsModuleSelf, scalaJavaVersion = sjVersion)
}

// ===
case class DeptsWithVersionModel(dept: DeptsModule, scalaJavaVersion: ScalaJavaVersion.Type)

// ==
case class DeptWithKey(dept: DeptsWithVersionModel, key: ChangeModuleIdName)

// ===
case class ChangeModuleIdName(name: String)

// ===
trait SettingInstance {
  protected var protectedSettings: List[SettingInstance.Type]
  private val setter = Adt.CoProduct3[ScalaJavaVersion.Type, DeptsModule, ChangeModuleIdName]
  private def addToSettingImpl(s: SettingInstance.Type): SettingInstance.AddedToSetting = {
    protectedSettings = s :: protectedSettings
    SettingInstance.AddedToSetting(s)
  }
  def outputSettings: List[SettingInstance.Type] = protectedSettings.reverse

  def addLib(t: DeptsModule): SettingInstance.AddedToSetting = {
    val sModel: SettingInstance.Type = setter(t)
    addToSettingImpl(sModel)
  }

  def addScalaVersion(t: ScalaJavaVersion.Type): SettingInstance.AddedToSetting = {
    val sModel: SettingInstance.Type = setter(t)
    addToSettingImpl(sModel)
  }

  def changeModuleName(name: String): SettingInstance.AddedToSetting = {
    val sModel: SettingInstance.Type = setter(ChangeModuleIdName(name))
    addToSettingImpl(sModel)
  }
}

object SettingInstance {
  SettingInstanceSelf =>

  case class AddedToSetting(v: SettingInstanceSelf.Type)

  type Type = Adt.CoProduct3[ScalaJavaVersion.Type, DeptsModule, ChangeModuleIdName]
  def instance(initSettings: List[SettingInstance.Type]): SettingInstance = new SettingInstance {
    override protected var protectedSettings: List[SettingInstance.Type] = initSettings
  }
}

// ===
trait AddJavaDeptsAbs {

  val settingInstance: SettingInstance = SettingInstance.instance(List.empty)

  object CrossVersion {
    val full: CrossInfo.Type = CrossInfo.`CrossVersion.full`
  }

  def addCompilerPlugin(dept: DeptsModule): SettingInstance.AddedToSetting =
    settingInstance.addLib(dept.copy(info = DeptInfo.CompilerPlugin))

  object scalaVersion {
    def :=(str: String): SettingInstance.AddedToSetting = settingInstance.addScalaVersion(ScalaJavaVersion.fromString(str))
  }

  implicit class `string_to_dept_extra`(val org: String) {
    extraSelf =>

    def %(name: String): DeptsModuleHelper1   = new DeptsModuleHelper1(org = extraSelf.org, name = name, platform = DeptType.JavaDept)
    def %%(name: String): DeptsModuleHelper1  = new DeptsModuleHelper1(org = extraSelf.org, name = name, platform = DeptType.ScalaDept)
    def %%%(name: String): DeptsModuleHelper1 = new DeptsModuleHelper1(org = extraSelf.org, name = name, platform = DeptType.ScalaJSDept)
  }

  object libraryDependencies {
    def +=(dept: DeptsModule): SettingInstance.AddedToSetting = settingInstance.addLib(dept)
  }

  object VarContext {
    object changeDeptVar {
      def :=(str: String): SettingInstance.AddedToSetting = settingInstance.changeModuleName(str)
    }

    object JavaVersionToSetting {
      object value
    }
    object customJV {
      def :=(str: JavaVersionToSetting.value.type): SettingInstance.AddedToSetting = {
        settingInstance.addScalaVersion(ScalaJavaVersion.JavaVersion)
      }
    }
  }

}
