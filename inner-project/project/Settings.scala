import sbt._
import sbt.Keys._

object Settings {

  val genAction     = inputKey[Unit]("inputTask for runMain.")
  val genActionImpl = inputKey[Unit]("inputTask for runMain implemention.")
  val `root/file`   = file(".").getCanonicalFile
  val `output/file` = `root/file` / "depts-output"
  val `plugin/file` = `root/file` / "depts-plugins"

  val versionFileString = settingKey[Int]("settingKey for version file.")
  val updateMVersion    = taskKey[Unit]("Update M Version.")
}

object SbtLauncherDeptsPlugin extends AutoPlugin {
  override def requires = plugins.IvyPlugin

  object autoImport {
    val SbtLaunchDeptsConfig = config("sbt-launch-depts-config")
  }
  import autoImport._

  override def projectConfigurations: Seq[Configuration] = Seq(SbtLaunchDeptsConfig)
  override def projectSettings: Seq[Setting[_]]          = Seq.empty

  /*(
    libraryDependencies += djx.sbt.depts.output.Djx314DeptsPlugin.autoImport.libScalax.`sbt-launch`.value.head % SbtLaunchConfiguration.name,
    rawSbtLaunchJar := {
      Classpaths.managedJars(SbtLaunchConfiguration, Set("jar"), update.value).headOption match {
        case Some(jar) => jar.data
        case None =>
          sys.error(
            s"Could not resolve sbt launcher!, dependencies := ${libraryDependencies.value}"
          )
      }
    },
    sbtLaunchJar := {
      val propFiles = (Compile / resources).value
      val propFileLocations =
        for (file <- propFiles; if file.getName != "resources") yield {
          if (file.getName == "sbt.boot.properties") "sbt/sbt.boot.properties" -> file
          else file.getName                                                    -> file
        }
      // TODO - We need to inject the appropriate boot.properties file for this version of sbt.
      rebundle(rawSbtLaunchJar.value, propFileLocations.toMap, target.value / "sbt-launch.jar")
    }
  )*/

}
