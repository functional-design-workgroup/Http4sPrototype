package org.awesome.http4s

import org.http4s.dsl._
import org.http4s.server.HttpService
import org.http4s.server.blaze.BlazeBuilder

object Http4sPrototype extends App {

  lazy val service = HttpService {
    case GET -> Root / "version" => Ok("1.0-SNAPSHOT")
  }

  BlazeBuilder.bindHttp(8080, "localhost")
    .mountService(service)
    .run
    .awaitShutdown()
}
