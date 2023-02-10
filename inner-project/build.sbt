import Settings._
import java.nio.file.Files
import java.nio.charset.StandardCharsets

scalaVersion := scalaV.v213

lazy val `depts-abs`            = project in rootFile / "depts-abs"
lazy val `depts-codegen`        = (project in rootFile / "depts-codegen").dependsOn(`depts-abs`)
lazy val `depts-output`         = project in outputFile
lazy val `depts-output-plugins` = project in pluginFile

updateMVersion := {
  val v         = (`depts-output` / versionFileString).value + 1
  val writeFile = rootFile / "MVersion-Count.sbt"
  Files.writeString(writeFile.toPath, s"ThisBuild / Settings.versionFileString := ${v.toString}", StandardCharsets.UTF_8)
}

genAction := {
  (`depts-abs` / genActionImpl).inputTaskValue.evaluated
  (`depts-codegen` / genActionImpl).inputTaskValue.evaluated
}

compatVersion := {
  val v         = (`depts-output` / version).value
  val writeFile = pluginFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "DjxPluginCusVersion.scala"
  Files.writeString(
    writeFile.toPath,
    s"""package djx.sbt.depts.plugins.impl; object GlobalVersion { val version = \"\"\"$v\"\"\" }""",
    StandardCharsets.UTF_8
  )
}

addCommandAlias("preparePackaging", "; scalafmtSbt; updateMVersion; genAction; compatVersion;")

ThisBuild / djxScalafmtFile := rootFile / ".djx314-scalafmt-common.conf"
ThisBuild / djxBuildSbtFile := rootFile / "project" / "build.properties"

Global / onChangedBuildSource := ReloadOnSourceChanges

`depts-output` / name         := "sbt-depts-djx314"
`depts-output-plugins` / name := "sbt-depts-djx314"
