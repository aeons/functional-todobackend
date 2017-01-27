name := "http4s-todo"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.1"

resolvers += Resolver.sonatypeRepo("snapshots")

val http4sVersion = "0.16.0-cats-SNAPSHOT"
val circeVersion  = "0.7.0"
val doobieVersion = "0.4.1"

libraryDependencies ++= Seq(
  "io.circe"     %% "circe-core"           % circeVersion,
  "io.circe"     %% "circe-generic"        % circeVersion,
  "io.circe"     %% "circe-generic-extras" % circeVersion,
  "io.circe"     %% "circe-parser"         % circeVersion,
  "org.http4s"   %% "http4s-blaze-server"  % http4sVersion,
  "org.http4s"   %% "http4s-circe"         % http4sVersion,
  "org.http4s"   %% "http4s-dsl"           % http4sVersion,
  "org.tpolecat" %% "doobie-core-cats"     % doobieVersion,
  "org.tpolecat" %% "doobie-h2-cats"       % doobieVersion,
  "org.slf4j"    % "slf4j-simple"          % "1.6.4"
)
