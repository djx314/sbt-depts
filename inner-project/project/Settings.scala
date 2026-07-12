import sbt._
import sbt.Keys._

object Settings {

  // val genAction         = taskKey[Unit]("inputTask for runMain.")
  // val genActionImpl     = taskKey[Unit]("inputTask for runMain implemention.")
  val `root/file`       = file(".").getCanonicalFile
  val `output/file`     = `root/file` / "depts-output"
  val `plugin/file`     = `root/file` / "depts-plugins"
  val versionFileString = settingKey[Int]("settingKey for version file.")
  val updateMVersion    = taskKey[Unit]("Update M Version.")

}
