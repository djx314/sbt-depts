package djx.sbt.depts.plugins

import java.io.PrintWriter
import java.nio.file.Path
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
    VersionWrap(
      main = VarSettings.read(Source.fromFile(path2(path).toFile)),
      MIndex = VarSettings.read(Source.fromFile(path1(path).toFile)).toInt
    )
  def writeWithRoot(path: Path): Unit = Using.resource(new PrintWriter(path1(path).toFile))(
    _.println(MIndex.toString)
  )

  val versionStr: String = s"$main-M$MIndex"
}
