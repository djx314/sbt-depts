# sbt-depts

[![Maven Central](https://img.shields.io/maven-central/v/net.scalax.djx314/sbt-depts-djx314-plugins_2.12.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22net.scalax.djx314%22%20AND%20a:%22sbt-depts-djx314%22)

A deceptive sbt project that sync the dependencies what `scalax` need.
```sbt
addSbtPlugin("net.scalax.djx314" % "sbt-depts-djx314" % "latest.version")
```
Related Poject:
1. [scala-workers/commons-lang3-bridge](https://github.com/scala-workers/commons-lang3-bridge)
1. [scalax/simple](https://github.com/scalax/simple)

待做：
版本直接写在resource里面，用特殊文件名，扩展名也不用conf，加载到conf（typesafe-conf）
然后转化成
```scala
case class MVersion(mCount: Int, version: String) {
  def genString: String = s"${version}-M${mCount}"
  def genTypesafeConfFileString: String = "info" // need implemention
}
```
而`build.sbt`可以读目录找文件，做同样解析，这样可以做到只有一个源头，修改也比较简单