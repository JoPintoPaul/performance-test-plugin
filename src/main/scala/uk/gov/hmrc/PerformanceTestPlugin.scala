package uk.gov.hmrc

import _root_.io.gatling.sbt.GatlingPlugin
import sbt.*
import sbt.Keys.*

object PerformanceTestPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = GatlingPlugin

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    libraryDependencies ++= Seq(
      "uk.gov.hmrc" %% "performance-test-runner" % "5.6.0" % Test,
      "io.gatling" % "gatling-test-framework" % "3.6.1" % Test,
      "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.6.1" % Test
    )
  )
}
