package djx.sbt.depts
package codegen

import abs.TakeSbtProperties

import java.io.{File, PrintWriter}
import java.nio.file.{Files, Path, Paths}
import scala.util.Using

class SbtVersionSetting(override protected val sbtPropertiesFile: File) extends TakeSbtProperties {

  def codegenAction(path: Path): Unit = {
    Files.createDirectories(path.getParent)
    Using.resource(new PrintWriter(path.toFile)) { printer =>
      printer.println(s"""
          |package djx.sbt.depts.plugin
          |
          |object SbtVersionSetting {
          |  val sbtVersion: String = \"\"\"$version\"\"\"
          |}
          |""".stripMargin)
    }
  }

}
