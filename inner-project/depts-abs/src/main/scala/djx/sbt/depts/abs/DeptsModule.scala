package djx.sbt.depts.abs

import net.scalax.simple.adt.{TypeAdt => Adt}

trait JavaDept
trait ScalaDept
trait ScalaJSDept

object DeptType {
  type Type = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]
  val Setter: Adt.CoProduct3Apply[JavaDept, ScalaDept, ScalaJSDept] = Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept]

  val JavaDept: Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept] = Setter(new JavaDept {
    //
  })
  val ScalaDept: Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept] = Setter(new ScalaDept {
    //
  })
  val ScalaJSDept: Adt.CoProduct3[JavaDept, ScalaDept, ScalaJSDept] = Setter(new ScalaJSDept {
    //
  })
}

trait CompilerPlugin
trait Library

object DeptInfo {
  type Type = Adt.CoProduct2[CompilerPlugin, Library]
  val Setter: Adt.CoProduct2Apply[CompilerPlugin, Library] = Adt.CoProduct2[CompilerPlugin, Library]

  val CompilerPlugin: Adt.CoProduct2[CompilerPlugin, Library] = Setter(new CompilerPlugin {
    //
  })
  val Library: Adt.CoProduct2[CompilerPlugin, Library] = Setter(new Library {
    //
  })
}

case class DeptsModule(org: String, name: String, platform: DeptType.Type, version: String, info: DeptInfo.Type)
