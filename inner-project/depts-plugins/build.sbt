scalaVersion := scalaV.v212

scalafmtOnCompile := true

libraryDependencies ++= libScalax.`sbt-librarymanagement`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
