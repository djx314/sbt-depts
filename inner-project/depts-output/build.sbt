import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition, SeeTree}

setting.setKey(scalaVersion)(sourcePosition.fromEnclosing).value(scalaV.v212)
setting.setKey(scalafmtOnCompile)(sourcePosition.fromEnclosing).value(true)

addSbtPlugin(djx314Plugins.`sbt-platform-deps`)
addSbtPlugin(djx314Plugins.`sbt-scalajs-crossproject`)
addSbtPlugin(djx314Plugins.`sbt-platform-deps`)

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`cats-core`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`kind-projector`.value

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
