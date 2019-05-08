package org.example.sbt

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class AkkaPluginCode {
  def execute(): Unit = {

    implicit val system = ActorSystem("foo")
//    implicit val materializer = ActorMaterializer()
    Thread.sleep(1000)

    Await.result(system.terminate(), Duration.Inf)

  }

}
