package djx.sbt.depts.abs

import net.scalax.simple.adt.{TypeAdt => Adt}

trait JavaDept
trait ScalaDept
trait ScalaJSDept

object DeptType {
  self =>

  type Type = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]
  val Setter: Adt.CoProduct3Apply[JavaDept, ScalaDept, ScalaJSDept] = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]

  val JavaDept: self.Type = Setter(new JavaDept {
    //
  })
  val ScalaDept: self.Type = Setter(new ScalaDept {
    //
  })
  val ScalaJSDept: self.Type = Setter(new ScalaJSDept {
    //
  })
}

trait CompilerPlugin
trait Library

object DeptInfo {
  self =>

  type Type = Adt.CoProduct2[CompilerPlugin, Library]
  val Setter: Adt.CoProduct2Apply[CompilerPlugin, Library] = Adt.CoProduct2[CompilerPlugin, Library]

  val CompilerPlugin: self.Type = Setter(new CompilerPlugin {
    //
  })
  val Library: self.Type = Setter(new Library {
    //
  })
}

case class DeptsModule(org: String, name: String, platform: DeptType.Type, version: String, info: DeptInfo.Type)
