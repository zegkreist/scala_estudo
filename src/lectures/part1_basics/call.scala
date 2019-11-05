package lectures.part1_basics

object call  extends App {

  def callbyvalue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callbyname(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  callbyvalue(System.nanoTime())
  callbyname(System.nanoTime())



  def infinity(): Int = {
    1 + infinity()
  }

  def print_first(x: Int, y: => Int) = {
    println(x)
  }

   // CRASH print_first(infinity(), 34)
  print_first(34, infinity()) // eval  of Y delayed
}
