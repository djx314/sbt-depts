package djx.sbt.depts
package output

import sbt.*
import sbt.Keys.*

import djx.sbt.depts.plugins.PluginsCollection

object Djx314DeptsPlugin extends AutoPlugin {
  Djx314DeptsPluginSelf =>

  override def requires                                  = sbt.plugins.IvyPlugin
  override def trigger: PluginTrigger                    = allRequirements
  override def projectConfigurations: Seq[Configuration] = super.projectConfigurations

  object autoImport extends BuildKeys {
    val scalaV: djx.sbt.depts.output.ScalaV = djx.sbt.depts.codegen.AppHaveATest.extractGen.scalaV

    val djx314Plugins: PluginsCollection = PluginsCollection

    private val scalaVersionSetting1: Setting[sbt.Task[Seq[String]]] = scalacOptions ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) => if (scalaMajor < 13L) Seq("-language:higherKinds") else Seq.empty
        case Some((3, scalaMajor)) => Seq("-Xkind-projector")
        case _                     => Seq.empty
      }
    }
    private val scalaVersionSetting2: Setting[Seq[sbt.ModuleID]] = libraryDependencies ++= libScalax.`kind-projector`.value

    val useKindProjector: Seq[Setting[?]] = List(scalaVersionSetting1, scalaVersionSetting2)
  }

  private class Settings(override val buildKeys: BuildKeys) extends Djx314DeptsImpl {
    SettingsSelf =>

    protected def settingProvide: Seq[Setting[Seq[sbt.ModuleID]]] = for {
      d <- djx.sbt.depts.codegen.AppHaveATest.extractGen.depts
    } yield {
      val indexU = djx.sbt.depts.codegen.AppHaveATest.extractGen.deptNames.indexOf(d.key)
      djx.sbt.depts.plugins.AddLibUtils.addOneDept(SettingsSelf.libraryList(indexU), d.dept)
    }

    def settingsForDept: Seq[Setting[?]] = SettingsSelf.settingProvide

  }

  private val settingsValue                                    = new Settings(autoImport)
  override def projectSettings: Seq[_root_.sbt.Def.Setting[?]] = settingsValue.settingsForDept
}
