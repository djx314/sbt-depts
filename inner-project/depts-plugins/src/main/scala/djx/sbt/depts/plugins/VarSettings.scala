package djx.sbt.depts.plugins

import scala.collection.compat._
import scala.io.Source
import scala.util.Using

object VarSettings {
  val versionFileName: String    = "olweolmngopjewepoewrtojoljoiejiriotuyh"
  val preVersionFileName: String = "oweksdolnweolsxdfjweoerhaetglhrl"

  val preList: List[String] = List("djx", "sbt", "depts", "plugins")

  val versionFilePath: List[String]    = preList ::: versionFileName :: List.empty
  val preVersionFilePath: List[String] = preList ::: preVersionFileName :: List.empty

  private val sourcePath1       = versionFilePath.mkString("/")
  private val arr1: Array[Byte] = Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath1))(_.readAllBytes())

  private val sourcePath2       = preVersionFilePath.mkString("/")
  private val arr2: Array[Byte] = Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath2))(_.readAllBytes())

  def read(str: String): String = Using.resource(Source.fromString(str))(_.getLines().to(List)).mkString.trim

  val MVersionInt: Int          = read(new String(arr1, "utf-8")).toInt
  val MainVersionString: String = read(new String(arr2, "utf-8"))
}
