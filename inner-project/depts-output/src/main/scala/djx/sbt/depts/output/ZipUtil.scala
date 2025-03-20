package djx.sbt.depts.output

import java.io.File
import java.nio.file.Path

object DjxZipUtil {
  def zipDirectory(localBundlePath: File, bundleZipDirPath: Path): File = {
    val localBundlePath1  = os.Path(localBundlePath)
    val bundleZipDirPath1 = os.Path(bundleZipDirPath)
    val targetZip         = bundleZipDirPath1 / "bundle.zip"
    os.makeDir.all(bundleZipDirPath1)
    if (os.exists(targetZip)) {
      println("File already zip. Passed.")
      targetZip.toIO
    } else {
      os.zip(dest = targetZip, sources = List(localBundlePath1)).toIO
    }
  }
}
