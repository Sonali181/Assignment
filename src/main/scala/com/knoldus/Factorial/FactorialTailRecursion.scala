package com.knoldus.Factorial
import scala.annotation.tailrec

class FactorialTailRecursion {

  def factorialTailRecursion(number : Int): Int={
    def factorialHelper(num:Int,acc: Int): Int= {
      if (num <= 0){
          acc
          }
      else {
          factorialHelper(num - 1, num * acc)
          }
      }
    factorialHelper(number, acc = 1)
      }
    }

object TestTailrec extends App {
  val num = new FactorialTailRecursion
  println(num.factorialTailRecursion(number = 5))
}