package models

case class Dino (id: Long, name: String)

object Dino {
  def all(): List[Dino] = Nil

  def create(name: String) = {}

  def delete(id: Long) = {}
}
