package djx.sbt.depts.plugins

import cats._
import cats.implicits._
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
import djx.sbt.depts.abs.models.ScalaJavaVersion

object AddLibUtils {
  AddLibUtilsSelf =>

  private def takeScalaVersion(sv: ScalaJavaVersion.Type, module: sbt.ModuleID, dept: DeptsWithVersionModel): Option[sbt.ModuleID] = sv
    .fold { (_: ScalaVersion212) =>
      dept.scalaJavaVersion
        .fold { (_: ScalaVersion212) =>
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
        .value
    }
    .apply { (_: ScalaVersion213) =>
      dept.scalaJavaVersion
        .fold { (_: ScalaVersion212) =>
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
        .value
    }
    .apply { (_: ScalaVersion3) =>
      dept.scalaJavaVersion
        .fold { (_: ScalaVersion212) =>
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
        .value
    }
    .apply { (_: JavaVersionForAllScala) =>
      dept.scalaJavaVersion
        .fold { (_: ScalaVersion212) =>
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
        .value
    }
    .value

  def addOneDept(
    libDepts: sbt.SettingKey[Seq[sbt.ModuleID]],
    oneDept: DeptsWithVersionModel
  ): sbt.Def.Setting[Seq[sbt.ModuleID]] = libDepts := {
    import sbt._
    import sbt.Keys._
    import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

    val sVersion: String                 = scalaVersion.value
    val scalaType: ScalaJavaVersion.Type = ScalaJavaVersion.fromString(sVersion)

    val confirmOpt: Option[Seq[sbt.ModuleID]] = libDepts.?.value
    val confirmSeq: Seq[sbt.ModuleID]         = confirmOpt.getOrElse(Seq.empty)

    val dept1 = oneDept.dept
    val libItem1: sbt.ModuleID = dept1.platform
      .fold { (_: JavaDept) => dept1.org % dept1.name % dept1.version }
      .apply { (_: ScalaDept) => dept1.org %% dept1.name % dept1.version }
      .apply { (_: ScalaJSDept) => dept1.org %%% dept1.name % dept1.version }
      .value

    val libItem2: sbt.ModuleID =
      dept1.crossInfo.fold((_: NoCrossVersion) => libItem1)((_: `CrossVersion.full`) => libItem1 cross CrossVersion.full).value

    val libIfCompilePlugin: sbt.ModuleID =
      dept1.info.fold((_: CompilerPlugin) => compilerPlugin(libItem2))((_: DeptsScalaLibrary) => libItem2).value

    val toLib1Opt: Option[sbt.ModuleID] = takeScalaVersion(scalaType, libIfCompilePlugin, oneDept)

    val libSeq1 = for (lib <- toLib1Opt) yield lib +: confirmSeq
    libSeq1.getOrElse(confirmSeq)
  }

}
