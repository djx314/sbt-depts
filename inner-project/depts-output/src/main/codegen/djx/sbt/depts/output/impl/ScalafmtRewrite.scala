package djx.sbt.depts.output.impl

import scala.collection.compat._

object ScalafmtRewrite {
  private val configString: String =
    """bWF4Q29sdW1uID0gMTQwDQphbGlnbi5wcmVzZXQgPSBtb3JlDQpjb250aW51YXRpb25JbmRlbnQuZGVmblNpdGUgPSAyDQpsaW5lRW5kaW5ncyA9IHVuaXgNCm9wdEluLmJyZWFrQ2hhaW5PbkZpcnN0TWV0aG9kRG90ID0gZmFsc2UNCnJld3JpdGUucnVsZXMgPSBbU29ydEltcG9ydHNdDQp2ZXJzaW9uID0gMy43LjE2DQpydW5uZXIuZGlhbGVjdCA9IHNjYWxhMw=="""
  private val writeString: String = new String(java.util.Base64.getDecoder.decode(configString), java.nio.charset.StandardCharsets.UTF_8)
  def writeToFile(file: java.nio.file.Path): Unit = scala.util.Using.resource(new java.io.FileOutputStream(file.toFile))(out =>
    scala.util.Using.resource(new java.io.PrintWriter(out))(writer => writer.println(writeString))
  )
}
