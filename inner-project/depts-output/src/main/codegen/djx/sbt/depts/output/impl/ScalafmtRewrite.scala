
package djx.sbt.depts.output.impl

import scala.collection.compat._

object ScalafmtRewrite {
  private val configString: String = """dmVyc2lvbiA9IDMuOS4y"""
  private val writeString: String = new String(java.util.Base64.getDecoder.decode(configString), java.nio.charset.StandardCharsets.UTF_8)
  def writeToFile(file: java.nio.file.Path): Unit = scala.util.Using.resource(new java.io.FileOutputStream(file.toFile))(out => scala.util.Using.resource(new java.io.PrintWriter(out))(writer => writer.println(writeString)))
}

