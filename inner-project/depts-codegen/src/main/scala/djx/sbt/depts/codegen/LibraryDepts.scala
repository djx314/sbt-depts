package djx.sbt.depts
package codegen

import abs.LibraryDepts

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.util.Using
import scala.collection.compat._

trait AppHaveATest {

  case class ScalaV(v212: Option[String], v213: Option[String], v3: Option[String]) {
    private def namesMap: List[(String, String)] =
      List("v212", "v213", "v3").zip(productIterator.to(List)).to(List).map(s => (s._1, s._2.asInstanceOf[Option[String]].get))

    val threeX = "\"" * 3
    def genString: String = s"""
         |val scalaV: ScalaV = ScalaV(${namesMap.map(s => s"`${s._1}` = ${threeX}${s._2}${threeX}").mkString(", ")})
         |""".stripMargin
  }

  object ScalaV {
    def init: ScalaV = ScalaV(v212 = Option.empty, v213 = Option.empty, v3 = Option.empty)
    val V212: String = "2.12"
    val V213: String = "2.13"
    val V3: String   = "3"
  }

  case class LibSettings(libStr: String, scalaV: String, libVarName: String) {
    def genString: String =
      s"""
         |libScalax.`$libVarName` ++= { $libStr }
         |""".stripMargin
  }
  object LibSettings {
    def genDefinedVar(name: String): String =
      s"""val `$name` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]](\"\"\"lib for $name\"\"\")"""
    def genInitVar(name: String): String =
      s"""innerSetting.setKey(libScalax.`$name`)(sourcePosition.fromEnclosing()).setIfNone(Seq.empty)"""
  }

  var contextVarName: String                                                    = null
  var contextScalaVersion: String                                               = null
  var scalaVersionCollect: ScalaV => ScalaV                                     = identity _
  var contextVarNames: List[String]                                             = List.empty
  var libSettings: Set[String]                                                  = Set.empty
  var PluginScalaVersionBoolean: String                                         = null
  var libSettingsMap: Map[(String, String), List[LibraryDepts.LibraryInstance]] = Map.empty

  def genString(key: String, currentVar: String, currentScalaVersion: String): String = {
    val keyStr     = "\"" + key + "\""
    val keyStr1    = "`" + key + "`"
    val sv: String = "\"" + currentScalaVersion + "\""
    s"innerSetting.addLibrarySetting(libScalax.$keyStr1)(${currentVar})(contextLibraryCollection.apply((${keyStr}, ${sv})))(sourcePosition.fromEnclosing())"
  }

  def extractGen(): Unit = {
    for (current <- LibraryDeptsInstance.context.value) {
      current match {
        case LibraryDepts.ChangeDeptVarSettings(name) =>
          contextVarName = name
          contextVarNames = contextVarNames ::: contextVarName :: List.empty[String]
        case LibraryDepts.AddLibrarySettings(libInfo) =>
          libSettings = libSettings + genString(contextVarName, PluginScalaVersionBoolean, contextScalaVersion)
          val temp  = libSettingsMap.getOrElse((contextVarName, contextScalaVersion), List.empty)
          val temp2 = libInfo :: temp
          libSettingsMap = libSettingsMap + (((contextVarName, contextScalaVersion), temp2))
        case LibraryDepts.ScalaVersionSingleSettings(scalaV) =>
          contextScalaVersion match {
            case "2.11" =>

            case ScalaV.V212 =>
              scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v212 = Option(scalaV)))
              PluginScalaVersionBoolean = "djxIsScala212"
            case ScalaV.V213 =>
              scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v213 = Option(scalaV)))
              PluginScalaVersionBoolean = "djxIsScala213"
            case ScalaV.V3 =>
              scalaVersionCollect = scalaVersionCollect.andThen(_.copy(v3 = Option(scalaV)))
              PluginScalaVersionBoolean = "djxIsScala3"
          }
        case LibraryDepts.ChangeScalaVerionSetting(scalaVersion) =>
          contextScalaVersion = scalaVersion
        case _    =>
        case null =>
      }

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

    libString = libString ::: (for (name <- deptNames) yield LibSettings.genInitVar(name))
    libString = libString ::: (for (libSetting <- libSettings) yield libSetting).to(List)

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
          |trait BuildKeys extends impl.BuildKeysAbs {
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

object AppHaveATest extends AppHaveATest
