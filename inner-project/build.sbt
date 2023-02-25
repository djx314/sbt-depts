import Settings._
import java.nio.file.Files
import java.nio.charset.StandardCharsets
import scala.util.Using
import java.io.PrintWriter
import java.io.FileOutputStream

scalaVersion := scalaV.v213

val `depts-abs`            = project in rootFile / "depts-abs"
val `depts-codegen`        = (project in rootFile / "depts-codegen").dependsOn(`depts-abs`)
val `depts-output-plugins` = project in pluginFile
val `depts-output`         = (project in outputFile).dependsOn(`depts-output-plugins`)

updateMVersion := {
  val v           = (`depts-output` / versionFileString).value + 1
  val writeFile   = rootFile / "MVersion-Count.sbt"
  val writeString = s"ThisBuild / Settings.versionFileString := ${v.toString}"
  Using.resource(new FileOutputStream(writeFile)) { out =>
    Using.resource(new PrintWriter(out)) { writer =>
      writer.println(writeString)
    }
  }
}

genAction := {
  (`depts-abs` / genActionImpl).inputTaskValue.evaluated
  (`depts-codegen` / genActionImpl).inputTaskValue.evaluated
}

compatVersion := {
  val v           = (`depts-output` / version).value
  val writeFile   = pluginFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "plugins" / "impl" / "DjxPluginCusVersion.scala"
  val writeString = s"""package djx.sbt.depts.plugins.impl; object GlobalVersion { val version = \"\"\"$v\"\"\" }"""
  Using.resource(new FileOutputStream(writeFile)) { out =>
    Using.resource(new PrintWriter(out)) { writer =>
      writer.println(writeString)
    }
  }
}

addCommandAlias("preparePackaging", "; scalafmtSbt; updateMVersion; genAction; compatVersion;")

Global / onChangedBuildSource := ReloadOnSourceChanges
