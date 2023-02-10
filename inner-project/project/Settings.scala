import sbt._
import sbt.Keys._

object Settings {
  val genAction     = inputKey[Unit]("inputTask for runMain.")
  val genActionImpl = inputKey[Unit]("inputTask for runMain implemention.")
  val rootFile      = file(".").getCanonicalFile
  val outputFile    = rootFile / "depts-output"
  val pluginFile    = rootFile / "depts-plugins"

  val versionFileString = settingKey[Int]("settingKey for version file.")
  val updateMVersion    = taskKey[Unit]("Update M Version.")
  val compatVersion     = taskKey[Unit]("Update M Version.")
}
