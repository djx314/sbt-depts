package djx.sbt.depts.plugins

import scala.io.Source
import scala.util.Using
import java.nio.charset.StandardCharsets

object GlobalVersion {

  private def versionFilePath: List[String] = List("djx", "sbt", "depts", "plugins", "sbt-depts-version")
  private def sourcePath1                   = versionFilePath.mkString("/")

  val version: String =
    Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath1))(i1 =>
      Using.resource(Source.fromInputStream(i1, StandardCharsets.UTF_8.name()))(i2 => i2.getLines().to(List).mkString(""))
    )

}
