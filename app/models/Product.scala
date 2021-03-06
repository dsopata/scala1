package models

import play.api.libs.json._

case class Product(id: Int, name: String, description: String, price: Double, category: Int, image: String)

object Product {
  implicit val productFormat: OFormat[Product] = Json.format[Product]
}
