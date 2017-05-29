name := "scalafun"

version := "1.0.0-SNAPSHOT"

organization := "es.madhava"

scalaVersion := "2.11.8"

val spark = "2.1.0"

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:+CMSClassUnloadingEnabled", "-XX:MaxMetaspaceSize=2048M")

parallelExecution in Test := false

fork in Test := true

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % spark % "provided",
  "org.apache.spark" %% "spark-sql" % spark % "provided",
  "org.apache.spark" %% "spark-hive" % spark % "provided")
  .map(_.excludeAll(
    ExclusionRule(organization = "org.scalacheck"),
    ExclusionRule(organization = "org.scalactic"),
    ExclusionRule(organization = "org.scalatest")
  ))

libraryDependencies ++= Seq(
  "com.holdenkarau" % "spark-testing-base_2.11" % s"${spark}_0.6.0" % "test"
)
