package djx.sbt.depts.abs;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import scala.io.Source;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.net.URL;
import java.time.Instant;

public class CodegenAction {

  public static void main(String[] arr) throws java.io.IOException, java.net.URISyntaxException {
    Class<xsbt.boot.Launch> launchClass = xsbt.boot.Launch.class;
    URL jarFileURL = launchClass.getProtectionDomain().getCodeSource().getLocation();
    Path jarPath = Paths.get(jarFileURL.toURI());
    String sbtDirName = "sbt-depts-resource-temp";
    String sbtLaunchDirName = "sbt-launch";
    Path outPutDir1 = Paths.get(".").resolve(sbtDirName).resolve(sbtLaunchDirName);
    Instant instant = Instant.now();
    long millions = instant.toEpochMilli();
    Path outPutDir2 = outPutDir1.resolve(String.valueOf(millions));
    Path outPutPath1 = outPutDir2.resolve(jarPath.getFileName().toString());
    Files.createDirectories(outPutDir2);
    Files.copy(jarPath, outPutPath1);
    System.out.println(outPutPath1);
  }

}
