package lectures.part2oop

object Objects extends App {

  // Scala does not have class-level functionality ("static")

  object Person { // Type + its only instance
    val N_EYES: Int = 2
    def can_fly: Boolean = {
      false
    }

    // factory
    def apply(mother: Person, father: Person): Person = {
      new Person("Son of Odin!")
    }
  }

  class Person( val name: String) {

  }

  println(Person.can_fly)
  println(Person.N_EYES)

  val john: Person = new Person("John")
  val mary: Person = new Person("Mary")

  val baby: Person = Person(mary, john)


  // Scala applications = Scala object with
  // def main(args: Array[String]): Unit

 // Scala object = Singleton Instance
}
