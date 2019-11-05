package lectures.part2oop

object Inheritence extends App {

  val cat: Cat = new Cat

  cat.crunch()
}

class Animal {
  protected def eat() = {
    println("nomnomnom")
  }
}

class Cat extends Animal {
  def crunch() = {
    eat()
    println("crunch crunch")
  }
}



class Person(name: String, age: Int) {

}

class Adult(name: String, age: Int, id_card: String) extends Person("John", 10)