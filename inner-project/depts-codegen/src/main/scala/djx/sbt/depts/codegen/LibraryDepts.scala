package djx.sbt.depts
package codegen

import abs.LibraryDepts

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.util.Using

object AppHaveATest {
  val libInstance = LibraryDeptsInstance.context.value

  def codegenAction(file: Path): Unit = {
    locally {
      Files.createDirectories(file.getParent)
    }

    val varStr: String = {
      val varCol = libInstance.collect { case LibraryDepts.ChangeDeptVarSettings(name) =>
        s"val `$name` = settingKey[Seq[_root_.sbt.librarymanagement.ModuleID]](\"\"\"lib for $name\"\"\")"
      }
      varCol.mkString("\n")
    }

    val crossScalaVersionsStr: String = libInstance.collectFirst { case LibraryDepts.CrossScalaVersionsSettings(versionsSeq) =>
      val versionString = List("v211", "v212", "v213", "v3")
      val sVersions     = versionsSeq.zip(versionString).map(s => s"`${s._2}` = \"\"\"${s._1}\"\"\"")
      val parmeters     = versionString.map(s => s"`$s`: String")
      s"""
         |case class scalaV(
         |  ${parmeters.mkString(", ")}
         |)
         |object scalaV extends scalaV(${sVersions.mkString(", ")})
         |""".stripMargin
    }.get

    val libString: List[String] = {
      var contextName: String                                 = null
      var repeatList: List[LibraryDepts.LibraryDeptsSettings] = libInstance
      var listLines: List[String]                             = List.empty

      while (!repeatList.isEmpty) {
        val current: LibraryDepts.LibraryDeptsSettings = repeatList.head
        current match {
          case LibraryDepts.ChangeDeptVarSettings(name) =>
            contextName = name
            listLines = listLines.appended(s"libScalax.`$contextName` := libScalax.`$contextName`.?.value.to(List).flatten")
          case LibraryDepts.AddLibrarySettings(libInfo) =>
            def genLibStr(lib: LibraryDepts.LibraryInstance): String = lib match {
              case LibraryDepts.LinkAppend(tail, current) =>
                current match {
                  case LibraryDepts.LitText(s)    => s"${genLibStr(tail)} $s"
                  case LibraryDepts.StringText(s) => s"${genLibStr(tail)} \"\"\"$s\"\"\""
                }
              case LibraryDepts.LinkZero(name) => s"\"\"\"$name\"\"\""
            }

            listLines = listLines.appended(s"libScalax.`$contextName` += ${genLibStr(libInfo)}")

          case _ =>
        }

        repeatList = repeatList.tail
      }

      listLines
    }

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
          |  $crossScalaVersionsStr
          |  object libScalax {
          |    $varStr
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
