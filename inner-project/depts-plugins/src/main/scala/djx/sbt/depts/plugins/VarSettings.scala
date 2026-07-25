/*
package djx.sbt.depts.plugins

import scala.collection.compat._
import scala.io.Source
import scala.util.Using

object VarSettings {
  import java.nio.file.{Files,Paths,Path}
  import java.nio.charset.StandardCharsets

  val preList: Path = Paths.get("djx", "sbt", "depts", "plugins","sbt-depts-version")

  val versionFilePath: List[String]    = preList ::: versionFileName :: List.empty
  val preVersionFilePath: List[String] = preList ::: preVersionFileName :: List.empty

  private val sourcePath1 = versionFilePath.mkString("/")
  private val arr1: String =
    Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath1))(i => read(Source.fromInputStream(i)))

  private val sourcePath2  = preVersionFilePath.mkString("/")
  private val arr2: String = Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath2))(i => read(Source.fromInputStream(i)))

  def read(source: => Source): String = Using.resource(source)(_.getLines().to(List)).mkString.trim

  val MVersionInt: Int          = arr1.toInt
  val MainVersionString: String = arr2
}
 */
