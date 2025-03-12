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

  def sumList(l: List[SettingInstance.Type]): SumModule = {
    val initModel: SumModule = SumModule(List.empty, List.empty, Map.empty)
    val initZero: FoldType   = (null, null, initModel)

    def foldAction(m: FoldType, listItem: SettingInstance.Type): FoldType = listItem.fold
      .apply { (sv: ScalaJavaVersion.Type) =>
        {
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
            .apply { (s3: JavaVersionForAllScala) =>
              None
            }

          val newList1 = for (a <- addToSVOpt) yield a :: m._3.scalaVersions
          val newList2 = newList1.getOrElse(m._3.scalaVersions)

          (sv, m._2, m._3.copy(scalaVersions = newList2))
        }
      }
      .apply { (deptModule: DeptsModule) =>
        val map1: Map[ChangeModuleIdName, List[DeptsWithVersionModel]]   = m._3.depts
        val value1: List[DeptsWithVersionModel]                          = map1.getOrElse(m._2, List.empty)
        val deptToAdd: DeptsWithVersionModel                             = deptModule.toScalaJavaVersion(m._1)
        val newMap: Map[ChangeModuleIdName, List[DeptsWithVersionModel]] = map1 + ((m._2, deptToAdd :: value1))
        (m._1, m._2, m._3.copy(depts = newMap))
      }
      .apply { (cName: ChangeModuleIdName) =>
        (m._1, cName, m._3.copy(deptNames = cName :: m._3.deptNames))
      }

    val (_, _, foldValue) = l.foldLeft(initZero)(foldAction)

    foldValue
  }

}
