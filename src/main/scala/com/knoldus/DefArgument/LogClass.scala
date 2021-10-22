package com.knoldus.DefArgument

class LogClass {
  def log(message: String, message1:String = "INFO"): String ={
    ("[level] " + message1)
  }
}

object Test extends App {
  val str = new LogClass
  println(str.log(message = "Hello"))
}
