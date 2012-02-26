package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models._
import views._

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.dinos)
  }

  val dinoForm = Form (
    "name" -> nonEmptyText
  )

  def dinos = Action {
    Ok(html.index(Dino.all(), dinoForm))
  }

  def edit(id: Long) = TODO

  def update(id: Long) =  TODO

  def create = TODO //  Action { implicit request =>
  //   Ok(html.createForm(dinoForm))
  // }

  def save = TODO

  def delete(id: Long) = Action { implicit request =>
    Dino.delete(id)
    Ok(html.index(Dino.all(), dinoForm))
  }
}
