package djx.sbt.depts
package abs
package models

import scala.collection.compat._
import net.scalax.simple.adt.{TypeAdt => Adt}

object SumList {

  type SumType = Adt.CoProduct3[ScalaVersion212, ScalaVersion213, ScalaVersion3]
  private val sumSetter = Adt.CoProduct3[ScalaVersion212, ScalaVersion213, ScalaVersion3]

  case class TempScalaVersion(s212: Option[String], s213: Option[String], s3: Option[String])
  object TempScalaVersion {
    val init: TempScalaVersion = TempScalaVersion(s212 = None, s213 = None, s3 = None)
  }

  case class SumModule(tempScalaVersions: TempScalaVersion, deptNames: Set[ChangeModuleIdName], depts: List[DeptWithKey])
  object SumModule {
    val init: SumModule = SumModule(tempScalaVersions = TempScalaVersion.init, deptNames = Set.empty, depts = List.empty)
  }

  case class ResultModel(scalaV: output.ScalaV, deptNames: Set[ChangeModuleIdName], depts: List[DeptWithKey])

  case class FoldType(scalaVersionAdt: ScalaJavaVersion.Type, moduleName: ChangeModuleIdName, foldModule: SumModule)

  private def foldActionImpl1(m: FoldType, sv: ScalaJavaVersion.Type): FoldType = {
    val provideList: TempScalaVersion = m.foldModule.tempScalaVersions

    val addToSVOpt: TempScalaVersion = sv.fold
      .apply { (s212: ScalaVersion212) =>
        provideList.copy(s212 = Some(s212.version212))
      }
      .apply { (s213: ScalaVersion213) =>
        provideList.copy(s213 = Some(s213.version213))
      }
      .apply { (s3: ScalaVersion3) =>
        provideList.copy(s3 = Some(s3.version3))
      }
      .apply { (_: JavaVersionForAllScala) =>
        provideList
      }

    m.copy(scalaVersionAdt = sv, foldModule = m.foldModule.copy(tempScalaVersions = addToSVOpt))
  }

  private def foldActionImpl2(m: FoldType, deptModule: DeptsModule): FoldType = {
    val map1: List[DeptWithKey]          = m.foldModule.depts
    val deptToAdd: DeptsWithVersionModel = deptModule.toScalaJavaVersion(m.scalaVersionAdt)
    val deptKey: DeptWithKey             = DeptWithKey(deptToAdd, m.moduleName)
    m.copy(foldModule = m.foldModule.copy(depts = deptKey :: map1))
  }

  private def foldActionImpl3(m: FoldType, cName: ChangeModuleIdName): FoldType =
    m.copy(moduleName = cName, foldModule = m.foldModule.copy(deptNames = m.foldModule.deptNames + cName))

  private def foldAction(m: FoldType, listItem: SettingInstance.Type): FoldType =
    listItem.fold(sv => foldActionImpl1(m, sv))(deptModule => foldActionImpl2(m, deptModule))(cName => foldActionImpl3(m, cName))

  def sumList(l: List[SettingInstance.Type]): ResultModel = {
    val initModel: SumModule = SumModule.init
    val initZero: FoldType   = FoldType(null, null, initModel)

    val FoldType(_, _, foldValue) = l.foldLeft(initZero)(foldAction)

    val svTemp: TempScalaVersion   = foldValue.tempScalaVersions
    val scalaVModel: output.ScalaV = output.ScalaV(v212 = svTemp.s212.get, v213 = svTemp.s213.get, v3 = svTemp.s3.get)

    ResultModel(scalaV = scalaVModel, deptNames = foldValue.deptNames, depts = foldValue.depts)
  }

}
