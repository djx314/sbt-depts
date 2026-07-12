libraryDependencies ++= {
  libScalax.`sbt-librarymanagement-core`.value.map(_.exclude("org.scala-sbt","util-interface"))
}
libraryDependencies ++= {
  libScalax.`scala-collection-compat`.value.map(_.exclude("org.scala-sbt","util-interface"))
}
libraryDependencies ++= {
  libScalax.`os-lib`.value.map(_.exclude("org.scala-sbt","util-interface"))
}

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
