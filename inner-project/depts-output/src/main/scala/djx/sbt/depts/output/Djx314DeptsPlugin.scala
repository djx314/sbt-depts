package djx.sbt.depts
package output

import sbt.*
import sbt.Keys.*

import scala.collection.compat.*
import impl.{ScalafmtRewrite, UpdatePluginLibVersion, UpdateSbtVersion}
import org.apache.commons.compress.archivers.zip.ZipIoUtil
import org.apache.commons.io.FileUtils

import collection.mutable.ListBuffer

package impl {

  import djx.sbt.depts.abs.LibraryDepts
  import djx.sbt.depts.codegen.AppHaveATest

  /*class BuildKeysAbs {
    val djxIsScalaJs: sbt.SettingKey[Option[Boolean]]                                       = settingKey[Option[Boolean]]("Is scala.js")
    val djxIsScala2: sbt.SettingKey[Boolean]                                                = settingKey[Boolean]("Is scala 2")
    val djxIsScala212: sbt.SettingKey[Boolean]                                              = settingKey[Boolean]("Is scala 2.12")
    val djxIsScala213: sbt.SettingKey[Boolean]                                              = settingKey[Boolean]("Is scala 2.13")
    val djxIsScala3: sbt.SettingKey[Boolean]                                                = settingKey[Boolean]("Is scala 3")
    val contextLibraryCollection: Map[(String, String), List[LibraryDepts.LibraryInstance]] = AppHaveATest.libSettingsMap
    val sourcePosition                                                                      = djx.sbt.depts.plugins.pUtils.sourcePosition
    val innerSetting: djx.sbt.depts.plugins.pUtils.setting                                  = djx.sbt.depts.plugins.pUtils.setting
  }*/

  class BuildKeysImpl extends BuildKeys {
    val sbtDJXDeptsSbtLaunchJar = taskKey[File]("The released version of the sbt-launcher we use to bundle this application.")

    val djxProjectRootPath = settingKey[File]("Key of project root.")

    val djxScalafmtFile         = settingKey[File]("Key of scalafmt file.")
    val djxUpdateScalafmtConfig = taskKey[Unit]("update scalafmt configuration file.")

    val djxBuildSbtFile     = settingKey[File]("Key of build.properties file.")
    val djxUpdateSbtVersion = taskKey[Unit]("update sbt version configuration file.")

    val djxPluginsLigFile       = settingKey[File]("Key of plugins's build.sbt file.")
    val djxUpdatePluginsVersion = taskKey[Unit]("update plugins's build.sbt file.")

    val djxUpdate = taskKey[Unit]("All update action for this plugin.")

    val snoatypeZipPackage = taskKey[File]("Zip sonatype files.")

    import djx.sbt.depts.plugins.{PluginsCollection => DjxPluginCol}
    val djx314Plugins: DjxPluginCol = DjxPluginCol
  }
}

object Djx314DeptsPlugin extends AutoPlugin {
  import xerial.sbt.Sonatype.autoImport.sonatypeBundleDirectory
  import scala.reflect.io.Directory
  import scala.util.Try
  import java.nio.file.{Files, Paths}

  override def requires =
    org.portablescala.sbtplatformdeps.PlatformDepsPlugin && sbtcrossproject.CrossPlugin && sbtcrossproject.CrossPlugin && sbt.plugins.IvyPlugin
  override def trigger: PluginTrigger                    = allRequirements
  override def projectConfigurations: Seq[Configuration] = super.projectConfigurations

  object autoImport extends impl.BuildKeysImpl {
    val scalaV: djx.sbt.depts.output.ScalaV = djx.sbt.depts.codegen.AppHaveATest.extractGen.scalaV
  }

  private class Settings(override val buildKeys: impl.BuildKeysImpl) extends Djx314DeptsImpl {
    SettingsSelf =>

    import buildKeys._
    object UpdateAction {
      private val settingsCol: ListBuffer[Setting[_]] = ListBuffer.empty

      settingsCol.+=(snoatypeZipPackage := {
        val fileDir: File   = sonatypeBundleDirectory.value
        val finalBundlePath = Paths.get(fileDir.toPath.toUri).resolve(s"${fileDir.getPath}-bundle")
        val bundleDirectory = Directory(finalBundlePath.toFile)

        Try {
          bundleDirectory.deleteRecursively()
          val bundleZipDirectory = Files.createDirectory(finalBundlePath)
          DjxZipUtil.zipDirectory(fileDir, bundleZipDirectory)
          finalBundlePath.toFile
        }.get
      })

      settingsCol.+=(sbtDJXDeptsSbtLaunchJar := {
        djx.sbt.depts.plugins.pUtils.sbtLaunchJarFile
      })

      settingsCol.+=(djxProjectRootPath := {
        djxProjectRootPath.?.value.getOrElse(new File("."))
      })

      settingsCol.+=(djxScalafmtFile := {
        new File(djxProjectRootPath.value, ".sbt-depts-scalafmt.conf")
      })
      settingsCol.+=(djxBuildSbtFile := {
        new File(new File(djxProjectRootPath.value, "project"), "build.properties")
      })
      settingsCol.+=(djxPluginsLigFile := {
        new File(new File(new File(djxProjectRootPath.value, "project"), "project"), "sbt-depts-djx314-lib.sbt")
      })

      settingsCol.+=(djxUpdateScalafmtConfig := {
        val fileOpt: Option[File] = djxScalafmtFile.?.value
        for (file <- fileOpt) yield ScalafmtRewrite.writeToFile(file.toPath)
      })
      settingsCol.+=(djxUpdateSbtVersion := {
        val fileOpt: Option[File] = djxBuildSbtFile.?.value
        for (file <- fileOpt) yield UpdateSbtVersion.update(file.toPath)
      })
      settingsCol.+=(djxUpdatePluginsVersion := {
        val fileOpt: Option[File] = djxPluginsLigFile.?.value
        for (file <- fileOpt) yield UpdatePluginLibVersion.update(file.toPath)
      })
      settingsCol.+=(djxUpdate := {
        djxUpdateScalafmtConfig.value
        djxUpdateSbtVersion.value
        djxUpdatePluginsVersion.value
      })

      val collect = settingsCol.to(List)
    }

    /*object scalaVersionSettings {
      private val settingsCol: ListBuffer[Setting[_]] = ListBuffer.empty

      settingsCol.+=(djxIsScala2 := { CrossVersion.partialVersion(scalaVersion.value).map(_._1) == Some(2L) })

      settingsCol.+=(djxIsScala212 := { CrossVersion.partialVersion(scalaVersion.value).map(_._2) == Some(12L) && djxIsScala2.value })

      settingsCol.+=(djxIsScala213 := { CrossVersion.partialVersion(scalaVersion.value).map(_._2) == Some(13L) && djxIsScala2.value })

      settingsCol.+=(djxIsScala3 := { CrossVersion.partialVersion(scalaVersion.value).map(_._1) == Some(3L) })

      settingsCol.+=({
        import scalajscrossproject.ScalaJSCrossPlugin.autoImport.JSPlatform
        import sbtcrossproject.CrossPlugin.autoImport._
        djxIsScalaJs := { crossProjectPlatform.?.value.map(s => s == JSPlatform) }
      })

      val collect = settingsCol.to(List)
    }

    object fix {
      private val settingsCol: ListBuffer[Setting[_]] = ListBuffer.empty

      val collect = settingsCol.to(List)
    }*/

    protected def settingProvide: Seq[Setting[Seq[sbt.ModuleID]]] = for (d <- djx.sbt.depts.codegen.AppHaveATest.extractGen.depts)
      yield djx.sbt.depts.plugins.AddLibUtils.addOneDept(SettingsSelf.libraryMap(d.key.name), d.dept)

    def settingsForDept: Seq[Setting[_]] = SettingsSelf.settingProvide ++: SettingsSelf.UpdateAction.collect

  }

  private val settingsValue                                    = new Settings(autoImport)
  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = settingsValue.settingsForDept
}
