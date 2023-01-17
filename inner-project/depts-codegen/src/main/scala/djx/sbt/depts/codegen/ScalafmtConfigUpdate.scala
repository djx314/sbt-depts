package djx.sbt.depts
package codegen

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import java.util.Base64
import scala.util.Using

object ScalafmtConfigUpdate {

  def base64FromFile(path: Path): String = {
    val bytes = Files.readAllBytes(path)
    Base64.getEncoder.encodeToString(bytes)
  }

  def toScalaFile(scalafmtConfigPath: Path, codegenFile: Path): Unit = {
    val str = base64FromFile(scalafmtConfigPath)
    val scalaFileString = s"""
       |package djx.sbt.depts.output.impl
       |
       |object ScalafmtRewrite {
       |  private val configString: String = \"\"\"$str\"\"\"
       |  private val writeString: String = new String(java.util.Base64.getDecoder.decode(configString), java.nio.charset.StandardCharsets.UTF_8)
       |  def writeToFile(file: java.nio.file.Path): Unit = java.nio.file.Files.writeString(file, writeString, java.nio.charset.StandardCharsets.UTF_8)
       |}
       |""".stripMargin

    Files.createDirectories(codegenFile.getParent)
    Using.resource(new PrintWriter(codegenFile.toFile)) { printer =>
      printer.println(scalaFileString)
    }
  }

}
