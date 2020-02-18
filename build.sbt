name := "recipebook"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"       % "3.4.0",
  "com.h2database"  %  "h2"                % "1.4.200",
  "ch.qos.logback"  %  "logback-classic"   % "1.2.3"
)
