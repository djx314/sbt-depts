package djx.sbt.depts.abs

import java.io.PrintWriter
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.util.Using
import scala.io.Source
import scala.collection.compat._

object CodegenAction {

  def main(arr: Array[String]): Unit = {
    def genString(pathStr: String): String =
      Using.resource(Source.fromFile(Paths.get(pathStr).toFile, StandardCharsets.UTF_8.name()))(u => u.getLines().mkString("\n"))

    val Array(str1: String, str2: String, str3: String, str4: String, writeFile: String) = arr

    val writePath = Paths.get(writeFile)
    locally {
      Files.createDirectories(writePath.getParent)
    }

    val strCol = for (s <- List(str1, str2, str3, str4)) yield genString(s)

    val strLines = Using.resource(Source.fromString(strCol.mkString("\n")))(l => l.getLines().to(List)).map(t => " " * 10 + t)

    Using.resource(new PrintWriter(writePath.toFile)) { printer =>
      val writeStr = s"""
         |package djx.sbt.depts
         |package codegen
         |
         |object LibraryDeptsInstance extends _root_.djx.sbt.depts.abs.AddJavaDeptsAbs {
         |
         |  ${strLines.mkString("\n\n")}
         |
         |}
         |""".stripMargin

      printer.println(writeStr)
    }
  }

}
