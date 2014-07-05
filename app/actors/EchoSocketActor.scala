package actors

import akka.actor._

object EchoSocketActor {
  def props(out: ActorRef):Props = Props(classOf[EchoSocketActor], out)
}

class EchoSocketActor(out: ActorRef) extends Actor{
  def receive = {
    case msg: String =>
      out ! msg // echo back
  }
}
