import Settings._

libraryDependencies ++= {
  libScalax.`coursier`.value.map(
    _.cross(CrossVersion.for3Use2_13)
      .exclude("org.scala-lang.modules", "scala-collection-compat_2.13")
      .exclude("org.scala-lang.modules", "scala-xml_2.13")
  )
}
