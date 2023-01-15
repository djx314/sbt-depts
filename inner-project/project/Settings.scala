import sbt._
import sbt.Keys._

object Settings {
  val genAction     = inputKey[Unit]("inputTask for runMain.")
  val genActionImpl = inputKey[Unit]("inputTask for runMain implemention.")
  val rootFile      = file(".").getCanonicalFile
  val outputFile    = rootFile / "depts-output"
}
