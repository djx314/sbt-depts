import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition, SeeTree}

scalaVersion      := scalaV.v212
scalafmtOnCompile := true

addSbtPlugin(djx314Plugins.`sbt-platform-deps`)
addSbtPlugin(djx314Plugins.`sbt-scalajs-crossproject`)
addSbtPlugin(djx314Plugins.`sbt-platform-deps`)

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`cats-core`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`kind-projector`.value
libraryDependencies ++= libScalax.`coursier`.value

enablePlugins(SbtPlugin)

pluginCrossBuild / sbtVersion := {
  scalaBinaryVersion.value match {
    case "2.12" => "1.8.2" // set minimum sbt version
  }
}

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  codegenFile +: v1
}
