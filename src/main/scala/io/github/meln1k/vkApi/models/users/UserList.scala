package io.github.meln1k.vkApi.models.users

import play.api.libs.json.Json


case class UserList(count: Int, items: Seq[User])

object UserList {
  implicit val userListReads = Json.reads[UserList]
}