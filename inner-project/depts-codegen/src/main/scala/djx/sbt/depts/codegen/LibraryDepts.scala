package djx.sbt.depts
package codegen

import abs.LibraryDepts

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.util.Using

trait AppHaveATest {

  case class ScalaV(v211: Option[String], v212: Option[String], v213: Option[String], v3: Option[String]) {
    private def namesMap: List[(String, String)] =
      productElementNames.zip(productIterator).to(List).map(s => (s._1, s._2.asInstanceOf[Option[String]].get))
    def genString: String = s"""
         |val scalaV: ScalaV = ScalaV(${namesMap.map(s => s"`${s._1}` = \"\"\"${s._2}\"\"\"").mkString(", ")})
         |""".stripMargin
  }
  object ScalaV {
    def init: ScalaV = ScalaV(v211 = Option.empty, v212 = Option.empty, v213 = Option.empty, v3 = Option.empty)
    val V211: String = "2.11"
    val V212: String = "2.12"
    val V213: String = "2.13"
    val V3: String   = "3"
  }

  case class LibSettings(libStr: String, scalaV: String, libVarName: String) {
    def genString: String =
      s"""
         |libScalax.`$libVarName` ++= { if (scalaBinaryVersion.value == \"\"\"$scalaV\"\"\") Seq($libStr) else Seq.empty }
         |""".stripMargin
  }
  object LibSettings {
    def genDefinedVar(name: String): String =
      s"""val `$name` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]](\"\"\"lib for $name\"\"\")"""
    def genInitVar(name: String): String = s"""libScalax.`$name` := libScalax.`$name`.?.value.to(List).flatten"""
  }

  var libInstance                                         = LibraryDeptsInstance.context.value
  var contextVarName: String                              = null
  var contextScalaVersion: String                         = null
  var scalaVersionCollect: ScalaV => ScalaV               = identity _
  var repeatList: List[LibraryDepts.LibraryDeptsSettings] = libInstance
  var contextVarNames: List[String]                       = List.empty
  var libSettings: List[LibSettings]                      = List.empty

  def extractGen(): Unit = {
    while (!repeatList.isEmpty) {
      val current: LibraryDepts.LibraryDeptsSettings = repeatList.head
      current match {
        case LibraryDepts.ChangeDeptVarSettings(name) =>
          contextVarName = name
          contextVarNames = contextVarNames.appended(contextVarName)
        case LibraryDepts.AddLibrarySettings(libInfo) =>
          libSettings =
            libSettings.appended(LibSettings(libStr = libInfo.genString, scalaV = contextScalaVersion, libVarName = contextVarName))
        case LibraryDepts.ScalaVersionSingleSettings(scalaV) =>
          contextScalaVersion match {
            case ScalaV.V211 => scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v211 = Option(scalaV)))
            case ScalaV.V212 => scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v212 = Option(scalaV)))
            case ScalaV.V213 => scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v213 = Option(scalaV)))
            case ScalaV.V3   => scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v3 = Option(scalaV)))
          }
        case LibraryDepts.ChangeScalaVerionSetting(scalaVersion) =>
          contextScalaVersion = scalaVersion
        case _    =>
        case null =>
      }

      repeatList = repeatList.tail
    }
  }

  extractGen()

  def codegenAction(file: Path): Unit = {
    locally {
      Files.createDirectories(file.getParent)
    }

    val scalaV: ScalaV = scalaVersionCollect(ScalaV.init)

    var libString: List[String] = List.empty

    val deptNames: List[String] = contextVarNames.to(Set).to(List)

    libString = libString.appendedAll(for (name <- deptNames) yield LibSettings.genInitVar(name))
    libString = libString.appendedAll(for (libSetting <- libSettings) yield libSetting.genString)

    val varDeineds = for (name <- deptNames) yield LibSettings.genDefinedVar(name)

    Using.resource(new PrintWriter(file.toFile)) { printer =>
      printer.println(s"""
          |package djx.sbt.depts.output
          |
          |import _root_.sbt._
          |import _root_.sbt.Keys._
          |import _root_.scala.collection.compat._
          |import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
          |
          |trait BuildKeys {
          |  ${scalaV.genString}
          |  object libScalax {
          |    ${varDeineds.mkString("\n")}
          |  }
          |}
          |
          |trait Djx314DeptsImpl {
          |
          |  val buildKeys: BuildKeys
          |  import buildKeys._
          |
          |  def settingsForDept: Seq[Setting[_]] = Seq(
          |    ${libString.mkString(",\n")}
          |  )
          |
          |}
          |""".stripMargin)
    }

  }

}
