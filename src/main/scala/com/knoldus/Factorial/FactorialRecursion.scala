package com.knoldus.Factorial

class FactorialRecursion {
  def factorial(number: Int): Int = {
    if (number <= 1) {
      number
    }
    else {
      number * factorial(number - 1)
         }
    }
  }

object TestRec extends App{
  val num= new FactorialRecursion
  println(num.factorial(number = 5))

}
