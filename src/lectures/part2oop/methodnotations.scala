package lectures.part2oop
import scala.language.postfixOps
object methodnotations extends App {
  class Person(val name: String, favorite_movie: String) {
    def likes(movie: String): Boolean = {
      movie == favorite_movie
    }

    def hang_out_with(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def +(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def +(string: String): Person = {
      new Person( name = this.name + s"($string)", favorite_movie = this.favorite_movie)
    }

    def unary_! : String = {
      s"${this.name} WHAT THE ACTUAL FUCK"
    }

    def is_dead: String = {
      s"${this.name} is dead!"
    }

    // default function of class
    def apply(): String = {
      s"Default function"
    }
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation works with methos with only one parameter

  // operators
  val tom = new Person("Tom", "Fight Club")
  println(mary hang_out_with tom)
  println(mary + tom)
  println(mary.hang_out_with(tom))
  println(!mary) // prefix

  println(mary is_dead) // postfix  def with no parameter

  // apply
  mary()

  val mary_2: Person = mary + "the rock star"
  println(!mary_2)
}
