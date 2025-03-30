import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition, SeeTree}

libraryDependencies ++= libScalax.`sbt-librarymanagement-core`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`os-lib`.value

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
