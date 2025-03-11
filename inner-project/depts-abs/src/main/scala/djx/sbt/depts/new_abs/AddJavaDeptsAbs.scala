package djx.sbt.depts.abs

import scala.collection.compat._
import models.{CrossInfo, DeptInfo, DeptType, DeptsModule}

class DeptsModuleHelper1(org: String, name: String, platform: DeptType.Type) {
  def %(version: String): DeptsModule = DeptsModule(
    org = org,
    name = name,
    platform = platform,
    version = version,
    info = DeptInfo.Library,
    crossInfo = CrossInfo.NoCrossVersion
  )
}

trait AddJavaDeptsAbs {

  object CrossVersion {
    val full: CrossInfo.Type = CrossInfo.`CrossVersion.full`
  }

  implicit class `%no_name_implicit_string`(val org: String) {
    def %(name: String): DeptsModuleHelper1   = new DeptsModuleHelper1(org = org, name = name, platform = DeptType.JavaDept)
    def %%(name: String): DeptsModuleHelper1  = new DeptsModuleHelper1(org = org, name = name, platform = DeptType.ScalaDept)
    def %%%(name: String): DeptsModuleHelper1 = new DeptsModuleHelper1(org = org, name = name, platform = DeptType.ScalaJSDept)
  }

}
