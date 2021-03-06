package controllers

import play.api._
import play.api.mvc._
import play.api.Play.current

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def echoSocket = WebSocket.acceptWithActor[String, String] { request => out =>
    actors.EchoSocketActor.props(out)
  }
}