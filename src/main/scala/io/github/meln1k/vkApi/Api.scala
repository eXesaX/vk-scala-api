package io.github.meln1k.vkApi

import io.github.meln1k.vkApi.methods.Users
import io.github.meln1k.vkApi.utils.{FakeAccessToken, RealAccessToken, AccessToken}


class Api(token: AccessToken) {

  private implicit val at = token

  lazy val users = new Users

  def auth = ???

  def wall = ???

  def photos = ???

  def friends = ???

  def widgets = ???

  def storage = ???

  def status = ???

  def audio = ???

  def pages = ???

  def groups = ???

  def board = ???

  def video = ???

  def notes = ???

  def places = ???

  def accout = ???

  def messages = ???

  def newsfeed = ???

  def likes = ???

  def polls = ???

  def docs = ???

  def fave = ???

  def notifications = ???

  def stats = ???

  def search = ???

  def apps = ???

  def utils = ???

  def database = ???

  def gifts = ???

  def execute = ???

}

object Api extends {

  def fromLoginPass(login: String, password: String) = ???

  def withAccessToken(accessToken: String) = new Api(RealAccessToken(accessToken))

  def anonymous = new Api(FakeAccessToken)

}
