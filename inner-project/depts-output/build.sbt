import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition, SeeTree}

setting.setConst(scalaVersion)(scalaV.v212)(sourcePosition.fromEnclosing)
setting.setConst(scalafmtOnCompile)(true)(sourcePosition.fromEnclosing)

addSbtPlugin(djx314Plugins.`sbt-platform-deps`)
addSbtPlugin(djx314Plugins.`sbt-scalajs-crossproject`)
addSbtPlugin(djx314Plugins.`sbt-platform-deps`)

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`cats`.value

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

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "utils"
  codegenFile +: v1
}
