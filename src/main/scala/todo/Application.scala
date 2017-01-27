package todo

import fs2.Task
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.server.middleware.{CORS, CORSConfig}
import org.http4s.server.{Server, ServerApp}

import scala.concurrent.duration._

object Application extends ServerApp {
  val corsConfig = CORSConfig(
    anyOrigin = true,
    allowCredentials = true,
    maxAge = 1.day.toSeconds
  )

  val corsTodoService = CORS(Service.httpService, corsConfig)

  override def server(args: List[String]): Task[Server] =
    BlazeBuilder
      .bindHttp(3000)
      .mountService(corsTodoService, "/")
      .start
}
