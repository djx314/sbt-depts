import Settings._

scalaVersion      := scalaV.v212
scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies ++= libScalax.`sbt-launch`.value.map(_ % SbtLaunchDeptsConfig.name)

val rawSbtLaunchJar = taskKey[File]("The released version of the sbt-launcher we use to bundle this application.")

rawSbtLaunchJar := {
  Classpaths.managedJars(SbtLaunchDeptsConfig, Set("jar"), update.value).headOption match {
    case Some(jar) => jar.data
    case None =>
      sys.error(
        s"Could not resolve sbt launcher!, dependencies := ${libraryDependencies.value}"
      )
  }
}
