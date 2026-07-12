import Settings._

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
