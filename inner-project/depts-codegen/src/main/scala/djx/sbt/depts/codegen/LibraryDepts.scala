package djx.sbt.depts
package codegen

import abs.LibraryDepts

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.util.Using
import scala.collection.compat._

trait AppHaveATest {

  def genStringVar: List[String] = for (d <- extractGen.deptNames.to(List))
    yield s"""val `${d.name}`: SettingKey[Seq[sbt.ModuleID]] = sbt.settingKey[Seq[sbt.ModuleID]](\"\"\"sbt library: ${d.name}\"\"\")"""

  def genStringSeq: List[String] = for (d <- extractGen.deptNames.to(List)) yield s"""libScalax.`${d.name}`"""

  def extractGen: djx.sbt.depts.abs.models.SumList.ResultModel =
    djx.sbt.depts.abs.models.SumList.sumList(LibraryDeptsInstance.settingInstance.outputSettings)

  def codegenAction(file: Path): Unit = {
    locally {
      Files.createDirectories(file.getParent)
    }

    Using.resource(new PrintWriter(file.toFile)) { printer =>
      printer.println(s"""
          package djx.sbt.depts.output

          import _root_.sbt._
          import _root_.sbt.Keys._
          import _root_.scala.collection.compat._
          import _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

          trait BuildKeys {
            object libScalax {
              ${genStringVar.mkString("\n")}
            }
          }

          trait Djx314DeptsImpl {

            val buildKeys: BuildKeys
            import buildKeys._

            def libraryList: List[SettingKey[Seq[sbt.ModuleID]]] = List(
              ${genStringSeq.mkString(",\n")}
            )

          }
          """)
    }

  }

}

object AppHaveATest extends AppHaveATest
