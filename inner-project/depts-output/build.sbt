import djx.sbt.depts.plugins.pUtils.{setting, sourcePosition, SeeTree}

setting.setConst(scalaVersion)(() => scalaV.v212)(sourcePosition.fromEnclosing)
setting.setConst(scalafmtOnCompile)(() => true)(sourcePosition.fromEnclosing)

addSbtPlugin(djx314Plugins.`sbt-platform-deps`)
addSbtPlugin(djx314Plugins.`sbt-scalajs-crossproject`)
addSbtPlugin(djx314Plugins.`sbt-platform-deps`)

// SeeTree.see(libraryDependencies += "aa" %%% "bb" % "cc")

/*sbt.Keys.libraryDependencies.append1[sbt.ModuleID](
  sbt.std.InitializeInstance.map[sbt.CrossVersion, sbt.librarymanagement.ModuleID](
    org.portablescala.sbtplatformdeps.PlatformDepsGroupID.platformDepsCrossVersion,
    (crossVersionInfo: sbt.CrossVersion) =>
      org.portablescala.sbtplatformdeps.PlatformDepsGroupID
        .withCross(
          org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport.toPlatformDepsGroupID("aa"),
          "bb",
          crossVersionInfo
        )
        .%("cc")
  ),
  sourcePosition.fromEnclosing()
)(sbt.Append.appendSeq[sbt.ModuleID, sbt.ModuleID]): sbt.Def.Setting[Seq[sbt.librarymanagement.ModuleID]]*/

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`cats`.value

scalafmtOnCompile := true

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
