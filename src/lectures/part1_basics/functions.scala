package lectures.part1_basics

object functions extends App {
  def a_function(a: String, b: Int): String = {
    a + " " + b
  }

  println(a_function(a = "eita", b = 1))

  println("-----------------------------------------------------")

  def function_without_parameter(): Int = 42

  println(function_without_parameter)
  println(function_without_parameter())

  println("-----------------------------------------------------")

  def repeated_function(a_string: String, n: Int): String = {
    if (n == 1) a_string
    else a_string + repeated_function(a_string, n-1)
  }

  println(repeated_function( a_string = "hello", n = 3))

  // USE FUNCTIONS TO LOOP LIKE R

  def function_with_side_effects(a_string: String): Unit = {
    println(a_string)
  }

  function_with_side_effects(a_string = "EITA CUZAO")


  def fib(n: Long): Long = {
    if (n == 1 | n == 2) 1
    else fib(n = n-1) +fib( n = n-2)
  }

  println(fib(8))
}
