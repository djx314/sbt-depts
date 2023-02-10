package djx.sbt.depts.plugins.impl

import sbt.librarymanagement.syntax._

trait PluginsColImpl {

  val `sbt-scalafmt`: sbt.librarymanagement.ModuleID = """org.scalameta""" % """sbt-scalafmt""" % """2.4.6"""

  val `sbt-revolver`: sbt.librarymanagement.ModuleID = """io.spray""" % """sbt-revolver""" % """0.9.1"""

  val `sbt-twirl`: sbt.librarymanagement.ModuleID = """com.typesafe.play""" % """sbt-twirl""" % """1.6.0-RC1"""

  val `sbt-sonatype`: sbt.librarymanagement.ModuleID = """org.xerial.sbt""" % """sbt-sonatype""" % """3.9.2"""

  val `sbt-pgp`: sbt.librarymanagement.ModuleID = """com.jsuereth""" % """sbt-pgp""" % """2.0.1"""

  val `sbt-scalajs-crossproject`: sbt.librarymanagement.ModuleID = """org.portable-scala""" % """sbt-scalajs-crossproject""" % """1.2.0"""

  val `sbt-git`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-git""" % """2.0.0"""

  val `sbt-ide-settings`: sbt.librarymanagement.ModuleID = """org.jetbrains.scala""" % """sbt-ide-settings""" % """1.1.1"""

  val `sbt-scalajs`: sbt.librarymanagement.ModuleID = """org.scala-js""" % """sbt-scalajs""" % """1.12.0"""

}
