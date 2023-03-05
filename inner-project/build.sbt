import Settings._
import scala.util.Using
import java.io.PrintWriter
import java.io.FileOutputStream

scalaVersion := scalaV.v212

val `depts-abs`            = project in `root/file` / "depts-abs"
val `depts-codegen`        = project in (`root/file` / "depts-codegen") dependsOn `depts-abs`
val `depts-output-plugins` = project in `plugin/file`
val `depts-output`         = project in `output/file` dependsOn `depts-output-plugins` aggregate `depts-output-plugins`

updateMVersion := {
  val v           = (`depts-output` / versionFileString).value + 1
  val writeFile   = `root/file` / "MVersion-Count.sbt"
  val writeString = s"ThisBuild / Settings.versionFileString := ${v.toString}"
  Using.resource(new PrintWriter(writeFile)) { writer =>
    writer.println(writeString)
  }
}

genAction := {
  (`depts-abs` / genActionImpl).inputTaskValue.evaluated
  (`depts-codegen` / genActionImpl).inputTaskValue.evaluated
}

compatVersion := {
  val v           = (`depts-output` / version).value
  val writeFile   = `plugin/file` / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "DjxPluginCusVersion.scala"
  val writeString = s"""package djx.sbt.depts.plugins.impl; object GlobalVersion { val version = \"\"\"$v\"\"\" }"""
  Using.resource(new PrintWriter(writeFile)) { writer =>
    writer.println(writeString)
  }
}

val allfmt = taskKey[Unit]("Format all projects.")
allfmt := {
  (Compile / scalafmtSbt).value
  (`depts-abs` / Compile / scalafmtSbt).value
  (`depts-codegen` / Compile / scalafmtSbt).value
  (`depts-output-plugins` / Compile / scalafmtSbt).value
  (`depts-output` / Compile / scalafmtSbt).value

  (Compile / scalafmt).value
  (`depts-abs` / Compile / scalafmt).value
  (`depts-codegen` / Compile / scalafmt).value
  (`depts-output-plugins` / Compile / scalafmt).value
  (`depts-output` / Compile / scalafmt).value
}

addCommandAlias("preparePackaging", "; updateMVersion; genAction; compatVersion; allfmt;")

Global / onChangedBuildSource := ReloadOnSourceChanges

`depts-output` / name := "sbt-depts-djx314"

`depts-output-plugins` / name := "sbt-depts-djx314-plugins"

addCommandAlias("bb", "; preparePackaging; depts-output/publishSigned;")
addCommandAlias("bbLocal", "; preparePackaging; depts-output/publishLocal;")
