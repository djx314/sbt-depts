package djx.sbt.depts.output.impl

object ScalafmtRewrite {
  private val configString: String =
    """bWF4Q29sdW1uID0gMTQwDQphbGlnbi5wcmVzZXQgPSBtb3JlDQpjb250aW51YXRpb25JbmRlbnQuZGVmblNpdGUgPSAyDQpsaW5lRW5kaW5ncyA9IHVuaXgNCm9wdEluLmJyZWFrQ2hhaW5PbkZpcnN0TWV0aG9kRG90ID0gZmFsc2UNCnJld3JpdGUucnVsZXMgPSBbU29ydEltcG9ydHNdDQp2ZXJzaW9uID0gMy42LjENCnJ1bm5lci5kaWFsZWN0ID0gc2NhbGEz"""
  private val writeString: String = new String(java.util.Base64.getDecoder.decode(configString), java.nio.charset.StandardCharsets.UTF_8)
  def writeToFile(file: java.nio.file.Path): Unit =
    java.nio.file.Files.writeString(file, writeString, java.nio.charset.StandardCharsets.UTF_8)
}
