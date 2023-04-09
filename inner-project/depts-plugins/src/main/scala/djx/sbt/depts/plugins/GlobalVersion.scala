package djx.sbt.depts.plugins.impl

import djx.sbt.depts.plugins.VarSettings

import java.io.PrintWriter
import java.nio.file.{Files, Path}
import scala.io.Source
import scala.util.Using
import scala.collection.compat._

object GlobalVersion {
  val versionWrap: VersionWrap = VersionWrap(main = VarSettings.MainVersionString, MIndex = VarSettings.MVersionInt)
  val version: String          = versionWrap.versionStr
}

case class VersionWrap(main: String, MIndex: Int) {

  private def path1(root: Path): Path = VarSettings.versionFilePath.foldLeft(root)((p, str) => p.resolve(str))
  private def path2(root: Path): Path = VarSettings.preVersionFilePath.foldLeft(root)((p, str) => p.resolve(str))

  def updateFromRoot(path: Path): VersionWrap =
    VersionWrap(main = VarSettings.read(Files.readString(path2(path))), MIndex = VarSettings.read(Files.readString(path1(path))).toInt)
  def writeWithRoot(path: Path): Unit = Using.resource(new PrintWriter(path1(path).toFile))(
    _.println(MIndex.toString)
  )

  val versionStr: String = s"$main-M$MIndex"
}
