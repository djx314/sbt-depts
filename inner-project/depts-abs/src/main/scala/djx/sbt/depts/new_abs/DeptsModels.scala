package djx.sbt.depts.abs
package models

import net.scalax.simple.adt.{TypeAdt => Adt}

// ===
trait JavaDept
trait ScalaDept
trait ScalaJSDept

object DeptType {
  DeptTypeSelf =>

  type Type = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]
  private val Setter = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]

  import DeptTypeSelf.{Type => AdtDeptsType}

  val JavaDept: AdtDeptsType = Setter.instance(new JavaDept {
    //
  })
  val ScalaDept: AdtDeptsType = Setter.instance(new ScalaDept {
    //
  })
  val ScalaJSDept: AdtDeptsType = Setter.instance(new ScalaJSDept {
    //
  })
}

// ===
trait CompilerPlugin
trait Library

object DeptInfo {
  DeptInfoSelf =>

  type Type = Adt.CoProduct2[CompilerPlugin, Library]
  private val Setter = Adt.CoProduct2[CompilerPlugin, Library]

  import DeptInfoSelf.{Type => AdtLibraryType}

  val CompilerPlugin: AdtLibraryType = Setter.instance(new CompilerPlugin {
    //
  })
  val Library: AdtLibraryType = Setter.instance(new Library {
    //
  })
}

// ===
trait NoCrossVersion
trait `CrossVersion.full`

object CrossInfo {
  CrossInfoSelf =>

  type Type = Adt.CoProduct2[NoCrossVersion, `CrossVersion.full`]
  private val Setter = Adt.CoProduct2[NoCrossVersion, `CrossVersion.full`]

  import CrossInfoSelf.{Type => AdtCrossType}

  val NoCrossVersion: AdtCrossType = Setter.instance(new NoCrossVersion {
    //
  })
  val `CrossVersion.full`: AdtCrossType = Setter.instance(new `CrossVersion.full` {
    //
  })
}
