package djx.sbt.depts.output

import com.lumidion.sonatype.central.client.core.{DeploymentName, PublishingType}

import sbt.util.Logger

import java.io.{File, FileInputStream, FileOutputStream}
import java.nio.file.{Files, Path}
import java.util.zip.{ZipEntry, ZipOutputStream}
import scala.reflect.io.Directory
import scala.util.Try

object DjxZipUtil {
  def zipDirectory(localBundlePath: File, bundleZipDirPath: Path): File = {
    val outputZipFilePath = s"${bundleZipDirPath.toFile.getPath}/bundle.zip"
    val fileOutputStream  = new FileOutputStream(outputZipFilePath)
    val zipOutputStream   = new ZipOutputStream(fileOutputStream)
    zipFile(localBundlePath, localBundlePath.getName, zipOutputStream, isDirTopLevel = true)
    zipOutputStream.close()
    fileOutputStream.close()

    new File(outputZipFilePath)
  }

  private def zipFile(fileToZip: File, fileName: String, zipOut: ZipOutputStream, isDirTopLevel: Boolean): Unit = {
    if (fileToZip.isHidden) return
    if (fileToZip.isDirectory) {
      if (!isDirTopLevel) {
        if (fileName.endsWith("/")) {
          zipOut.putNextEntry(new ZipEntry(fileName))
          zipOut.closeEntry()
        } else {
          zipOut.putNextEntry(new ZipEntry(fileName + "/"))
          zipOut.closeEntry()
        }
      }
      val children = fileToZip.listFiles
      val directoryPath = if (isDirTopLevel) {
        ""
      } else fileName + "/"
      for (childFile <- children) {
        zipFile(childFile, directoryPath + childFile.getName, zipOut, isDirTopLevel = false)
      }
      return
    }
    val fileInputStream = new FileInputStream(fileToZip)
    val zipEntry        = new ZipEntry(fileName)
    zipOut.putNextEntry(zipEntry)
    val bytes  = new Array[Byte](1024)
    var length = 0
    while ({ length = fileInputStream.read(bytes); length } >= 0) {
      zipOut.write(bytes, 0, length)
    }
    fileInputStream.close()
  }
}
