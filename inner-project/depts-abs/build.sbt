import Settings._

libraryDependencies ++= libScalax.`typesafe-config`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= {
  libScalax.`simple-adt`.value.map(_.exclude("org.scala-sbt", "util-interface"))
}
libraryDependencies ++= libScalax.`sbt-librarymanagement-core`.value
