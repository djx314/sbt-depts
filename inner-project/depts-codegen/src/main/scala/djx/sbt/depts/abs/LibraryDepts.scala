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
      val sVersions = versionsSeq.zip(List("v211", "v212", "v213", "v3")).map(s => s"val `${s._2}` = \"\"\"${s._1}\"\"\"")
      s"""
         |object scalaV {
         |
         |  ${sVersions.mkString("\n")}
         |
         |}
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
              case LibraryDepts.LinkAppend(tail, current, link) => s"${genLibStr(tail)} $link \"\"\"$current\"\"\""
              case LibraryDepts.LinkZero(name)                  => s"\"\"\"$name\"\"\""
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
          |trait Djx314DeptsPluginImpl extends _root_.sbt.AutoPlugin {
          |
          |  override def trigger: PluginTrigger = allRequirements
          |
          |  object autoImportImpl {
          |    object libScalax {
          |      $varStr
          |    }
          |    $crossScalaVersionsStr
          |  }
          |
          |  import autoImportImpl._
          |
          |  override def buildSettings: Seq[Setting[_]] = Seq(
          |    ${libString.mkString(",\n")}
          |  )
          |
          |}
          |""".stripMargin)
    }

  }
}
