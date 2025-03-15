package djx.sbt.depts.plugins

import cats._
import cats.implicits._
import djx.sbt.depts.abs.LibraryDepts
import net.scalax.simple.adt.{TypeAdt => Adt}
import java.io.File
import djx.sbt.depts.abs.models.{
  `CrossVersion.full`,
  CompilerPlugin,
  JavaDept,
  JavaVersionForAllScala,
  Library => DeptsScalaLibrary,
  NoCrossVersion,
  ScalaDept,
  ScalaJSDept,
  ScalaVersion212,
  ScalaVersion213,
  ScalaVersion3
}

import djx.sbt.depts.abs.DeptsWithVersionModel

object AddLibUtils extends AddLibUtils

trait AddLibUtils {
  AddLibUtilsSelf =>

  private object s212VImpl
  private object s213VImpl
  private object s3VImpl
  private object otherVImpl
  private type SType = Adt.CoProduct4[s212VImpl.type, s213VImpl.type, s3VImpl.type, otherVImpl.type]
  private val Setter = Adt.CoProduct4[s212VImpl.type, s213VImpl.type, s3VImpl.type, otherVImpl.type]

  private def toSType(sv: Option[(Long, Long)]): SType = sv match {
    case Some((2L, 12L)) => Setter(s212VImpl)
    case Some((2L, 13L)) => Setter(s213VImpl)
    case Some((3L, _))   => Setter(s3VImpl)
    case _               => Setter(otherVImpl)
  }

  private def takeScalaVersion(sv: SType, module: sbt.ModuleID, dept: DeptsWithVersionModel): Option[sbt.ModuleID] = sv.fold
    .apply { (_: s212VImpl.type) =>
      dept.scalaJavaVersion.fold
        .apply { (_: ScalaVersion212) =>
          Some(module)
        }
        .apply { (_: ScalaVersion213) =>
          None
        }
        .apply { (_: ScalaVersion3) =>
          None
        }
        .apply { (_: JavaVersionForAllScala) =>
          Some(module)
        }
    }
    .apply { (_: s213VImpl.type) =>
      dept.scalaJavaVersion.fold
        .apply { (_: ScalaVersion212) =>
          None
        }
        .apply { (_: ScalaVersion213) =>
          Some(module)
        }
        .apply { (_: ScalaVersion3) =>
          None
        }
        .apply { (_: JavaVersionForAllScala) =>
          Some(module)
        }
    }
    .apply { (_: s3VImpl.type) =>
      dept.scalaJavaVersion.fold
        .apply { (_: ScalaVersion212) =>
          None
        }
        .apply { (_: ScalaVersion213) =>
          None
        }
        .apply { (_: ScalaVersion3) =>
          Some(module)
        }
        .apply { (_: JavaVersionForAllScala) =>
          Some(module)
        }
    }
    .apply { (_: otherVImpl.type) =>
      dept.scalaJavaVersion.fold
        .apply { (_: ScalaVersion212) =>
          None
        }
        .apply { (_: ScalaVersion213) =>
          None
        }
        .apply { (_: ScalaVersion3) =>
          None
        }
        .apply { (_: JavaVersionForAllScala) =>
          Some(module)
        }
    }

  /*def addDepts(
    libDepts: sbt.SettingKey[Seq[sbt.ModuleID]],
    depts: List[DeptsWithVersionModel]
  ): sbt.Def.Setting[Seq[sbt.ModuleID]] = {
    import sbt._
    import sbt.Keys._
    import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

    libDepts := {
      val sVersion: String = scalaVersion.value

      val toLib1: List[Option[sbt.ModuleID]] = for (dept <- depts) yield {
        val libItem1: sbt.ModuleID = dept.platform.fold
          .apply { (_: JavaDept) => dept.org % dept.name % dept.version }
          .apply { (_: ScalaDept) => dept.org %% dept.name % dept.version }
          .apply { (_: ScalaJSDept) => dept.org %%% dept.name % dept.version }

        val libItem2: sbt.ModuleID =
          dept.crossInfo.fold((_: NoCrossVersion) => libItem1)((_: `CrossVersion.full`) => libItem1 cross CrossVersion.full)

        val libIfCompilePlugin: sbt.ModuleID =
          dept.info.fold((_: CompilerPlugin) => compilerPlugin(libItem2))((_: DeptsScalaLibrary) => libItem2)

        takeScalaVersion(CrossVersion.partialVersion(sVersion), libIfCompilePlugin, dept)
      }

      val toLib2: List[sbt.ModuleID] = toLib1.collect { case Some(t) => t }

      val confirmOpt: Option[Seq[sbt.ModuleID]] = libDepts.?.value
      val confirmSeq: Seq[sbt.ModuleID]         = confirmOpt.getOrElse(Seq.empty)
      toLib2 ++: confirmSeq
    }
  }*/

  def addOneDept(
    libDepts: sbt.SettingKey[Seq[sbt.ModuleID]],
    oneDept: DeptsWithVersionModel
  ): sbt.Def.Setting[Seq[sbt.ModuleID]] = libDepts := {
    import sbt._
    import sbt.Keys._
    import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

    val sVersion: String = scalaVersion.value

    val dept1 = oneDept.dept
    val libItem1: sbt.ModuleID = dept1.platform.fold
      .apply { (_: JavaDept) => dept1.org % dept1.name % dept1.version }
      .apply { (_: ScalaDept) => dept1.org %% dept1.name % dept1.version }
      .apply { (_: ScalaJSDept) => dept1.org %%% dept1.name % dept1.version }

    val libItem2: sbt.ModuleID =
      dept1.crossInfo.fold((_: NoCrossVersion) => libItem1)((_: `CrossVersion.full`) => libItem1 cross CrossVersion.full)

    val libIfCompilePlugin: sbt.ModuleID =
      dept1.info.fold((_: CompilerPlugin) => compilerPlugin(libItem2))((_: DeptsScalaLibrary) => libItem2)

    val scalaType: SType                = toSType(CrossVersion.partialVersion(sVersion))
    val toLib1Opt: Option[sbt.ModuleID] = takeScalaVersion(scalaType, libIfCompilePlugin, oneDept)

    val confirmOpt: Option[Seq[sbt.ModuleID]] = libDepts.?.value
    val confirmSeq: Seq[sbt.ModuleID]         = confirmOpt.getOrElse(Seq.empty)

    val libSeq1 = for (lib <- toLib1Opt) yield lib +: confirmSeq
    libSeq1.getOrElse(confirmSeq)
  }

}
