package lectures.part1_basics

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1)  )
      val result: Int = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
  }


  def factorial_2(n: Int): BigInt = {
    @tailrec
    def factorial_helper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorial_helper(x-1, x*accumulator)

    }
    factorial_helper(n, 1)
  }
  println(factorial_2(5000))

}
