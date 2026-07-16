// addSbtPlugin(djx314Plugins.`sbt-platform-deps`)
addSbtPlugin(djx314Plugins.`sbt-scalajs`)
// addSbtPlugin(djx314Plugins.`sbt-sonatype`)

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`cats-core`.value
libraryDependencies ++= libScalax.`kind-projector`.value
libraryDependencies ++= {
  List(
    "io.get-coursier" % "coursier-core"  % "2.1.24",
    "io.get-coursier" % "coursier-cache" % "2.1.24",
    "io.get-coursier" % "coursier"       % "2.1.24"
  ).map(
    _.cross(CrossVersion.for3Use2_13)
      .exclude("org.scala-lang.modules", "scala-collection-compat_2.13")
      .exclude("org.scala-lang.modules", "scala-xml_2.13")
  )
}

enablePlugins(SbtPlugin)
sbtPluginPublishLegacyMavenStyle := false

pluginCrossBuild / sbtVersion := {
  scalaBinaryVersion.value match {
    case "3" => "2.0.0" // set minimum sbt version
  }
}

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
