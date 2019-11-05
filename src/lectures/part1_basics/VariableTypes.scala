package lectures.part1_basics

object VariableTypes extends App {
  // Vals são imutáveis
  // O Compile pode inferir o type
  val x: Int = 42
  //println(x)

  val a_string: String = "Hello"
  //println(a_string)

  val a_bool: Boolean = true
  //println(a_bool)
  val a_character: Char = 'a'
  val a_short: Short = 4613 //4 byte
  val a_long: Long = 56165465544544554L // 8 byte
  val a_float: Float = 2.0f
  val a_double: Double = 2.0

  //variables using VAR

  var a_variable: Int = 4
  println(a_variable)
  a_variable = 5
  println(a_variable)

}
