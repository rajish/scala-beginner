package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models._

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.dinos)
  }

  val dinoForm = Form (
    "name" -> nonEmptyText
  )

  def dinos = Action {
    Ok(views.html.index(Dino.all(), dinoForm))
  }
}
