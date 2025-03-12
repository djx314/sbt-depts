package djx.sbt.depts.abs
package models

import scala.collection.compat._
import net.scalax.simple.adt.{TypeAdt => Adt}

object SumList {

  type SumType = Adt.CoProduct3[ScalaVersion212, ScalaVersion213, ScalaVersion3]
  private val sumSetter = Adt.CoProduct3[ScalaVersion212, ScalaVersion213, ScalaVersion3]

  case class SumModule(
    scalaVersions: List[SumType],
    deptNames: List[ChangeModuleIdName],
    depts: Map[ChangeModuleIdName, List[DeptsWithVersionModel]]
  )

  type FoldType = (ScalaJavaVersion.Type, ChangeModuleIdName, SumModule)

  private def foldActionImpl1(m: FoldType, sv: ScalaJavaVersion.Type): FoldType = {
    val addToSVOpt: Option[SumType] = sv.fold
      .apply { (s212: ScalaVersion212) =>
        Some(sumSetter(s212))
      }
      .apply { (s213: ScalaVersion213) =>
        Some(sumSetter(s213))
      }
      .apply { (s3: ScalaVersion3) =>
        Some(sumSetter(s3))
      }
      .apply { (_: JavaVersionForAllScala) =>
        None
      }

    val provideList: List[SumType] = m._3.scalaVersions
    val newList1                   = for (a <- addToSVOpt) yield a :: provideList
    val newList2                   = newList1.getOrElse(provideList)

    (sv, m._2, m._3.copy(scalaVersions = newList2))
  }

  private def foldActionImpl2(m: FoldType, deptModule: DeptsModule): FoldType = {
    val map1: Map[ChangeModuleIdName, List[DeptsWithVersionModel]]   = m._3.depts
    val value1: List[DeptsWithVersionModel]                          = map1.getOrElse(m._2, List.empty)
    val deptToAdd: DeptsWithVersionModel                             = deptModule.toScalaJavaVersion(m._1)
    val newMap: Map[ChangeModuleIdName, List[DeptsWithVersionModel]] = map1 + ((m._2, deptToAdd :: value1))
    (m._1, m._2, m._3.copy(depts = newMap))
  }

  private def foldActionImpl3(m: FoldType, cName: ChangeModuleIdName): FoldType =
    (m._1, cName, m._3.copy(deptNames = cName :: m._3.deptNames))

  private def foldAction(m: FoldType, listItem: SettingInstance.Type): FoldType =
    listItem.fold(sv => foldActionImpl1(m, sv))(deptModule => foldActionImpl2(m, deptModule))(cName => foldActionImpl3(m, cName))

  def sumList(l: List[SettingInstance.Type]): SumModule = {
    val initModel: SumModule = SumModule(List.empty, List.empty, Map.empty)
    val initZero: FoldType   = (null, null, initModel)

    val (_, _, foldValue) = l.foldLeft(initZero)(foldAction)

    foldValue
  }

}
