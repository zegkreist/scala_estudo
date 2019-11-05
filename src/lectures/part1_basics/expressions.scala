package lectures.part1_basics

object expressions extends App {

  val x: Int = 1+2 // Expressions
  println(x)
  println("------")

  println(2+3 *4)
  println("------")

  println(1 == x)
  // ==   !=  >  >=   <   <=

  println("------")

  println(!(1 == x))
  println("------")
  var a_variable: Int = 2
  a_variable += 1
  println(a_variable)

  println("---------------------------------------------------------------")

  val a_condition: Boolean = true
  val a_conditioned_value: Int = if(a_condition) 5 else 3 // IF Expression,  like ifelse from R

  println(a_conditioned_value)

  println("---------------------------------------------------------------")

  var i: Int = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN
  // EVERYTHIUNG in Scala is a Expression

  // Unit is like Void

  val a_weird_value = (a_variable = 3)
  println(a_weird_value)
  val another_weird_value: Unit = (a_variable = 3)
  println(another_weird_value)

  // code blocks


  val a_code_block = {

    val y:Int = 2
    val z:Int = y + 1

    if (z > 2) "Hello" else "goodbay"

  }

  println(a_code_block)

  val a_code_block1: String = {
    val y:Int = 2
    val z:Int = y + 1

    if (z < 2) "Hello" else "goodbay"
  }

  println(a_code_block1)
}
