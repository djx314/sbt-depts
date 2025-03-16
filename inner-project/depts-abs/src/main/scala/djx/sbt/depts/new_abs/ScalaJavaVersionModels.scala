package djx.sbt.depts.abs
package models

import net.scalax.simple.adt.{TypeAdt => Adt}

// ===
trait ScalaVersion212 {
  def version212: String
}
trait ScalaVersion213 {
  def version213: String
}
trait ScalaVersion3 {
  def version3: String
}
trait JavaVersionForAllScala

object ScalaJavaVersion {
  ScalaJavaVersionSelf =>

  type Type = Adt.CoProduct4[ScalaVersion212, ScalaVersion213, ScalaVersion3, JavaVersionForAllScala]
  private val Setter = Adt.CoProduct4[ScalaVersion212, ScalaVersion213, ScalaVersion3, JavaVersionForAllScala]

  import ScalaJavaVersionSelf.{Type => ScalaJavaVersionType}

  private def ScalaVersion212(version: String): ScalaJavaVersionType = Setter(new ScalaVersion212 {
    override def version212: String = version
  })

  private def ScalaVersion213(version: String): ScalaJavaVersionType = Setter(new ScalaVersion213 {
    override def version213: String = version
  })

  private def ScalaVersion3(version: String): ScalaJavaVersionType = Setter(new ScalaVersion3 {
    override def version3: String = version
  })

  val JavaVersion: ScalaJavaVersionType = Setter(new JavaVersionForAllScala {
    //
  })

  def fromString(v: String): ScalaJavaVersionType = sbt.librarymanagement.CrossVersion.partialVersion(v) match {
    case Some((2L, 12L)) => ScalaJavaVersion.ScalaVersion212(v)
    case Some((2L, 13L)) => ScalaJavaVersion.ScalaVersion213(v)
    case Some((3L, _))   => ScalaJavaVersion.ScalaVersion3(v)
    case _               => JavaVersion
  }

}
