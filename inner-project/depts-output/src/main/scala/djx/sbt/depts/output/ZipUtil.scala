package djx.sbt.depts.output

import java.io.File
import java.nio.file.Path

object DjxZipUtil {
  def zipDirectory(localBundlePath: File, bundleZipDirPath: Path): File = {
    val localBundlePath1  = os.Path(localBundlePath)
    val bundleZipDirPath1 = os.Path(bundleZipDirPath)
    os.zip(dest = bundleZipDirPath1 / "bundle.zip", sources = List(localBundlePath1)).toIO
  }
}
