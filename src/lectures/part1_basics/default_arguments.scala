package lectures.part1_basics

object default_arguments extends App {



  def factorial_helper(x: Int, accumulator: BigInt = 1): BigInt = {
    if (x <= 1) accumulator
    else factorial_helper(x-1, x*accumulator)
  }

  val fact10: BigInt = factorial_helper(x = 10)

  println(fact10)
}
