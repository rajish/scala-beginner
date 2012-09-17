package controllers

import models._
import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import views._


object Application extends Controller {

  def index = Action {
    val funval = "funval"
    Redirect(routes.Application.dinos)
  }
  var somevar = Nil

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
