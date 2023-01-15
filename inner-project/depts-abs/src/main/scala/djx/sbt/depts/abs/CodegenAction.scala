package djx.sbt.depts.abs

import java.io.PrintWriter
import java.nio.file.{Files, Paths}
import scala.util.Using

object CodegenAction {

  def main(arr: Array[String]): Unit = {
    val buildSbtPath = Paths.get(arr(0))
    val stringReaded = Files.readString(buildSbtPath)

    val writePath = Paths.get(arr(1))
    locally {
      Files.createDirectories(writePath.getParent)
    }
    Using.resource(new PrintWriter(writePath.toFile)) { printer =>
      val writeStr = s"""
         |package djx.sbt.depts
         |package codegen
         |
         |object LibraryDeptsInstance extends _root_.djx.sbt.depts.abs.LibraryDepts {
         |
         |  $stringReaded
         |
         |}
         |""".stripMargin

      printer.println(writeStr)
    }
  }

}
