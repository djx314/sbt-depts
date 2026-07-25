package djx.sbt.depts.plugins

import java.io.PrintWriter
import java.nio.file.Path
import scala.io.Source
import scala.util.Using
import scala.collection.compat._

object GlobalVersion {
  import java.nio.file.{Files, Path, Paths}
  import java.nio.charset.StandardCharsets

  private def versionFilePath: List[String] = List("djx", "sbt", "depts", "plugins", "sbt-depts-version")
  private def sourcePath1                   = versionFilePath.mkString("/")

  val version: String =
    Using.resource(getClass.getClassLoader.getResourceAsStream(sourcePath1))(i1 =>
      Using.resource(Source.fromInputStream(i1, StandardCharsets.UTF_8.name()))(i2 => i2.getLines().to(List).mkString(""))
    )
}

/*case class VersionWrap(main: String, MIndex: Int) {

  private def path1(root: Path): Path = VarSettings.versionFilePath.foldLeft(root)((p, str) => p.resolve(str))
  private def path2(root: Path): Path = VarSettings.preVersionFilePath.foldLeft(root)((p, str) => p.resolve(str))

  def updateFromRoot(path: Path): VersionWrap = VersionWrap(
    main = VarSettings.read(Source.fromFile(path2(path).toFile)),
    MIndex = VarSettings.read(Source.fromFile(path1(path).toFile)).toInt
  )

  def writeWithRoot(path: Path): Unit = {
    os.remove(os.Path(path1(path)))
    os.write(os.Path(path1(path)), MIndex.toString)
  }

  val versionStr: String = s"$main.$MIndex"
}*/
