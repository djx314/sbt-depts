package djx.sbt.depts.abs

import java.io.PrintWriter
import java.nio.file.{Files, Paths}
import scala.util.Using
import scala.io.Source
import java.nio.charset.StandardCharsets
import scala.collection.compat._

object CodegenActionPlugin {

  def main(arr: Array[String]): Unit = {
    val strCol = Using.resource(Source.fromFile(Paths.get(arr(0)).toFile, StandardCharsets.UTF_8.name()))(u => u.getLines().mkString("\n"))
    val writePath = Paths.get(arr(1))

    locally {
      Files.createDirectories(writePath.getParent)
    }

    val strLines = Using.resource(Source.fromString(strCol))(l => l.getLines().to(List)).map(t => " " * 10 + t)

    Using.resource(new PrintWriter(writePath.toFile)) { printer =>
      val writeStr = s"""
         |package djx.sbt.depts
         |package codegen
         |
         |object LibraryPluginDeptsInstance extends _root_.djx.sbt.depts.abs.PluginDepts {
         |
         |  ${strLines.mkString("\n\n")}
         |
         |}
         |""".stripMargin

      printer.println(writeStr)
    }
  }

}
