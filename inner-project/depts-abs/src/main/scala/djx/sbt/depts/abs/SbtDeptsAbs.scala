package djx.sbt.depts.abs

import scala.language.dynamics
import scala.util.Using
import scala.io.Source

package impl {
  object SbtPropertiesImpl {
    val start = "SetV"

    val SetZero: SbtVA = SbtVA(Some(List.empty))

    case class SbtVA(i1: Option[List[String]]) extends Dynamic {

      def selectDynamic(key: String): SbtVA = {
        val v2 = for {
          i1V <- i1
          k   <- Some(key) if k.startsWith(start)
        } yield i1V.appended(k.drop(start.length))
        SbtVA(v2)
      }

      def properties: Option[SbtPropertiesData] = for (i1V <- i1) yield SbtPropertiesData(i1V)
    }

    def fromConfigFile(str: String): String = Using.resource(Source.fromString(str)) { s =>
      val s1 = for (l1 <- s.getLines.to(List)) yield l1.trim
      val s2 = s1.filterNot(_.isEmpty)
      s2.head.replace(".", s".$start").replace("=", s".$start")
    }
  }
}

case class SbtPropertiesData(t: List[String])

trait SbtPropertiesAbs {

  object sbt {
    val SetVversion: impl.SbtPropertiesImpl.SbtVA = impl.SbtPropertiesImpl.SetZero
  }

  val properties: Option[SbtPropertiesData] = sbt.SetVversion.SetV1.SetV8.SetV2.properties

  println(impl.SbtPropertiesImpl.fromConfigFile("sbt.version=1.8.2")) // sbt.SetVversion.SetV1.SetV8.SetV2
  println(sbt.SetVversion.SetV1.SetV8.SetV2)
  println(properties)

}

object bb extends App with SbtPropertiesAbs
