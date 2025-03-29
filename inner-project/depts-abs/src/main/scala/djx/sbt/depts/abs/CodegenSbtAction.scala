package djx.sbt.depts.abs

import java.io.PrintWriter
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.collection.compat._
import scala.io.Source
import scala.util.Using

object CodegenSbtAction {

  def main(arr: Array[String]): Unit = {
    val strCol: List[String] =
      Using.resource(Source.fromFile(Paths.get(arr(0)).toFile, StandardCharsets.UTF_8.name()))(u => u.getLines().to(List))
    val writePath = Paths.get(arr(1))

    locally {
      Files.createDirectories(writePath.getParent)
    }

    Using.resource(new PrintWriter(writePath.toFile)) { printer =>
      val writeStr = s"""
         |package djx.sbt.depts
         |package codegen
         |
         |import _root_.djx.sbt.depts.abs.TakeSbtProperties._
         |
         |object SbtVersionInfo extends _root_.djx.sbt.depts.abs.TakeSbtProperties(${strCol.mkString("\n\n")})
         |""".stripMargin

      printer.println(writeStr)
    }
  }

}
