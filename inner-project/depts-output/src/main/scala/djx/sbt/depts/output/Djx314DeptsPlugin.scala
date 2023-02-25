package djx.sbt.depts
package output

import sbt._
import sbt.Keys._
import scala.collection.compat._

import impl.{ScalafmtRewrite, UpdatePluginLibVersion, UpdateSbtVersion}
import collection.mutable.ListBuffer

package impl {
  class BuildKeysAbs {
    val djxIsScalaJs  = settingKey[Option[Boolean]]("Is scala.js")
    val djxIsScala2   = settingKey[Boolean]("Is scala 2")
    val djxIsScala211 = settingKey[Boolean]("Is scala 2.11")
    val djxIsScala212 = settingKey[Boolean]("Is scala 2.12")
    val djxIsScala213 = settingKey[Boolean]("Is scala 2.13")
    val djxIsScala3   = settingKey[Boolean]("Is scala 3")
  }

  class BuildKeysImpl extends BuildKeys {
    val djxProjectRootPath = settingKey[File]("Key of project root.")

    val djxScalafmtFile         = settingKey[File]("Key of scalafmt file.")
    val djxUpdateScalafmtConfig = taskKey[Unit]("update scalafmt configuration file.")

    val djxBuildSbtFile     = settingKey[File]("Key of build.properties file.")
    val djxUpdateSbtVersion = taskKey[Unit]("update sbt version configuration file.")

    val djxPluginsLigFile       = settingKey[File]("Key of plugins's build.sbt file.")
    val djxUpdatePluginsVersion = taskKey[Unit]("update plugins's build.sbt file.")

    val djxUpdate = taskKey[Unit]("All update action for this plugin.")

    import djx.sbt.depts.plugins.{PluginsCollection => DjxPluginCol}
    val djx314Plugins: DjxPluginCol = DjxPluginCol
  }
}

object Djx314DeptsPlugin extends AutoPlugin {
  override def requires: Plugins =
    org.portablescala.sbtplatformdeps.PlatformDepsPlugin && sbtcrossproject.CrossPlugin && sbtcrossproject.CrossPlugin
  override def trigger: PluginTrigger = allRequirements

  object autoImport extends impl.BuildKeysImpl

  private class Settings(override val buildKeys: impl.BuildKeysImpl) extends Djx314DeptsImpl {
    import buildKeys._
    object UpdateAction {
      private val settingsCol: ListBuffer[Setting[_]] = ListBuffer.empty

      settingsCol.+=(djxScalafmtFile := {
        new File(djxProjectRootPath.value, ".sbt-depts-scalafmt-common.conf")
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

    object scalaVersionSettings {
      private val settingsCol: ListBuffer[Setting[_]] = ListBuffer.empty

      settingsCol.+=(djxIsScala2 := { CrossVersion.partialVersion(scalaVersion.value).map(_._1) == Some(2L) })

      settingsCol.+=(djxIsScala211 := { CrossVersion.partialVersion(scalaVersion.value).map(_._2) == Some(11L) && djxIsScala2.value })

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

      settingsCol.+=(libScalax.circe := {
        if (djxIsScala211.value && djxIsScalaJs.value == Some(true))
          Seq.empty
        else
          for (libCol <- libScalax.circe.?.value.to(List); lib <- libCol) yield lib
      })

      settingsCol.+=(libScalax.`kind-projector` := { for (lib <- libScalax.`kind-projector`.value) yield compilerPlugin(lib) })

      val collect = settingsCol.to(List)
    }

    override def settingsForDept: Seq[Setting[_]] =
      scalaVersionSettings.collect ++: super.settingsForDept ++: fix.collect ++: UpdateAction.collect
  }

  private val settingsValue                                    = new Settings(autoImport)
  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = settingsValue.settingsForDept
}
