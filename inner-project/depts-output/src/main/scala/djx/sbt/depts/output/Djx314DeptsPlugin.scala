package djx.sbt.depts
package output

import sbt._
import sbt.Keys._

import impl.{ScalafmtRewrite, UpdateSbtVersion}

package impl {
  class BuildKeysImpl extends BuildKeys {
    val djxScalafmtFile         = settingKey[File]("Key of scalafmt file.")
    val djxUpdateScalafmtConfig = taskKey[Unit]("update scalafmt configuration file.")
    val djxBuildSbtFile         = settingKey[File]("Key of build.properties file.")
    val djxUpdateSbtVersion     = taskKey[Unit]("update sbt version configuration file.")
    val djxUpdateAll            = taskKey[Unit]("All update action for this plugin.")
  }
}

object Djx314DeptsPlugin extends AutoPlugin {
  override def requires: Plugins      = org.portablescala.sbtplatformdeps.PlatformDepsPlugin
  override def trigger: PluginTrigger = allRequirements

  object autoImport extends impl.BuildKeysImpl

  private class Settings(override val buildKeys: impl.BuildKeysImpl) extends Djx314DeptsImpl {
    import buildKeys._
    val updateScalafmtConfigSetting = djxUpdateScalafmtConfig := {
      val fileValue: File = djxScalafmtFile.value
      ScalafmtRewrite.writeToFile(fileValue.toPath)
    }
    val updateSbtVersionSetting = djxUpdateSbtVersion := {
      val fileValue: File = djxBuildSbtFile.value
      UpdateSbtVersion.update(fileValue.toPath)
    }
    val djxUpdateAllSetting = djxUpdateAll := {
      djxUpdateScalafmtConfig.value
      djxUpdateSbtVersion.value
    }
    // def projectSettings: Seq[Setting[_]] = Seq.empty
    override def settingsForDept: Seq[Setting[_]] =
      djxUpdateAllSetting +: updateScalafmtConfigSetting +: updateSbtVersionSetting +: super.settingsForDept
  }

  private val settingsValue                                    = new Settings(autoImport)
  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = settingsValue.settingsForDept
  // override def buildSettings: Seq[_root_.sbt.Def.Setting[_]]   = settingsValue.settingsForDept
}
