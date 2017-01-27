package todo

import io.circe.generic.extras._
import io.circe.generic.extras.auto._
import io.circe.syntax._
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

object Service {

  implicit val circeConfig = Configuration.default.withDefaults

  val httpService = HttpService {
    case r @ POST -> Root =>
      r.as(jsonOf[Todo]).flatMap { todo =>
        Ok(todo.asJson)
      }

    case GET -> Root => Ok(List.empty.asJson)

    case DELETE -> Root => Ok()
  }
}
