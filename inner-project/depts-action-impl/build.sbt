import Settings._

scalaVersion      := scalaV.v212
scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

libraryDependencies ++= libScalax.`commons-io`.value
