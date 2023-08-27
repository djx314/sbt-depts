package djx.sbt.depts.plugins.impl

import sbt.librarymanagement.syntax._

trait PluginsColImpl {

  val `sbt-scalafmt`: sbt.librarymanagement.ModuleID = """org.scalameta""" % """sbt-scalafmt""" % """2.5.0"""

  val `sbt-revolver`: sbt.librarymanagement.ModuleID = """io.spray""" % """sbt-revolver""" % """0.10.0"""

  val `sbt-twirl`: sbt.librarymanagement.ModuleID = """com.typesafe.play""" % """sbt-twirl""" % """1.6.0-RC4"""

  val `sbt-sonatype`: sbt.librarymanagement.ModuleID = """org.xerial.sbt""" % """sbt-sonatype""" % """3.9.21"""

  val `sbt-pgp`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-pgp""" % """2.2.1"""

  val `sbt-scalajs-crossproject`: sbt.librarymanagement.ModuleID = """org.portable-scala""" % """sbt-scalajs-crossproject""" % """1.3.2"""

  val `sbt-git`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-git""" % """2.0.1"""

  val `sbt-ide-settings`: sbt.librarymanagement.ModuleID = """org.jetbrains.scala""" % """sbt-ide-settings""" % """1.1.1"""

  val `sbt-scalajs`: sbt.librarymanagement.ModuleID = """org.scala-js""" % """sbt-scalajs""" % """1.13.2"""

  val `sbt-platform-deps`: sbt.librarymanagement.ModuleID = """org.portable-scala""" % """sbt-platform-deps""" % """1.0.2"""

  val `flyway-sbt`: sbt.librarymanagement.ModuleID = """io.github.davidmweber""" % """flyway-sbt""" % """7.4.0"""

  val `sbt-web-scalajs`: sbt.librarymanagement.ModuleID = """com.vmunier""" % """sbt-web-scalajs""" % """1.2.0"""

  val `sbt-depts-djx314`: sbt.librarymanagement.ModuleID = """net.scalax.djx314""" % """sbt-depts-djx314""" % """0.0.1-M730"""

  val `sbt-js-engine`: sbt.librarymanagement.ModuleID = """com.typesafe.sbt""" % """sbt-js-engine""" % """1.2.3"""

  val `sbt-scala-js-map`: sbt.librarymanagement.ModuleID = """com.thoughtworks.sbt-scala-js-map""" % """sbt-scala-js-map""" % """4.1.1"""

  val `sbt-assembly`: sbt.librarymanagement.ModuleID = """com.eed3si9n""" % """sbt-assembly""" % """2.1.1"""

  val `sbt-scoverage`: sbt.librarymanagement.ModuleID = """org.scoverage""" % """sbt-scoverage""" % """2.0.8"""

  val `sbt-github-actions`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-github-actions""" % """0.15.0"""

  val `sbt-jacoco`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-jacoco""" % """3.4.0"""

}
