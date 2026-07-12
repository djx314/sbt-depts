import Settings._

libraryDependencies ++= {
  libScalax.`coursier`.value.map(_.exclude("org.scala-sbt","util-interface"))
}
