/*
 * Copyright 2024 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
