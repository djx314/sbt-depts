import Settings._

scalaVersion := "2.13.10"

scalafmtOnCompile := true

Compile / compile := ((Compile / compile) dependsOn (Compile / scalafmtSbt)).value

val propsPath      = rootFile / ".." / "project" / "build.properties"
val sbtVersionFile = outputFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "SbtVersionSetting.scala"
val libVersionFile = outputFile / "src" / "main" / "codegen" / "djx" / "sbt" / "depts" / "output" / "DeptsPlugin.scala"

genActionImpl := (Compile / runMain).inputTaskValue
  .partialInput(" djx.sbt.depts.codegen.CodegenRunner")
  .partialInput(s" ${propsPath.getCanonicalFile.toString}")
  .partialInput(s" ${sbtVersionFile.getCanonicalFile.toString}")
  .partialInput(s" ${libVersionFile.getCanonicalFile.toString}")
  .evaluated

Compile / unmanagedSourceDirectories := {
  val v1          = (Compile / unmanagedSourceDirectories).value
  val codegenFile = sourceDirectory.value / "main" / "codegen"
  println(codegenFile.getCanonicalFile)
  codegenFile +: v1
}
