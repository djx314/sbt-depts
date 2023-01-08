scalaVersion := "2.13.10"

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value
