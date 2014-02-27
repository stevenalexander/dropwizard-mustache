import AssemblyKeys._

name:="dropwizard-mustache"

version:="0.1"

scalaVersion:="2.10.2"

resolvers ++= Seq(
   "Coda Hale repo" at "http://repo.codahale.com/"
 )

libraryDependencies ++= Seq(
  "com.yammer.dropwizard" % "dropwizard-core" % "0.6.2",
  "com.yammer.dropwizard" % "dropwizard-views" % "0.6.2",
  "javax.servlet" % "javax.servlet-api" % "3.0.1"
)

ivyXML :=
  <dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="3.0.0.v201112011016">
    <artifact name="javax.servlet" type="orbit" ext="jar"/>
  </dependency>

assemblySettings

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
    case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
    case "application.conf" => MergeStrategy.concat
    case "unwanted.txt"     => MergeStrategy.discard
    case x => old(x)
  }
}

scalacOptions ++= Seq("-unchecked", "-deprecation")