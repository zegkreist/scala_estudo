package lectures.part2oop

object OOBasics extends App {

  val person = new Person(name = "John")
  person.greet("Daniel")
  person.greet()
  person.age()


  val author_george = new Writer(first_name = "George", surname = "Martin", year = 1940)
  val game_of_thrones = new Novel(name = "Game of thrones", year_r = 1989, author = author_george)

  author_george.full_name()

  game_of_thrones.is_written()
  game_of_thrones.release_date()

  val updated_game_of_thrones = game_of_thrones.copy(addition = 10)
  updated_game_of_thrones.release_date()
}


// constructor
class Person( name: String,  age: Int) {
  // body defines a interpretations of a class
  // can have expressions
  // can have definitios like functions and packages
  // val x: Int = 2  Are fields
  // All instantiation of a class person this block will be valuated

  // Method
  def greet(name: String): Unit = {
    println(s"${this.name} says: HI, ${name}")
  }

  // Overloading
  def greet(): Unit = {
    println(s"Hi, I am ${name}")
  }

  def age(): Unit = {
    println(s"My Age is: $age")
  }

  // Multiple constructors. Its like a default for class
  def this(name: String) = this(name, 40)

}
class Writer(val first_name: String, val surname: String, year: Int) {

  def full_name(): Unit = {
    println(s"Name: $first_name $surname")
  }
}

class Novel(name: String, year_r: Int, author: Writer) {
  def is_written(): Unit = {
    println("É escrito por " + author.first_name + " " + author.surname)
  }
  def copy(addition: Int): Novel = {
    new Novel(name = name, year_r = year_r + addition, author = author)

  }

  def release_date(): Unit = {
    println(s"Release Year: $year_r")
  }
}

// class parameters are not Fields that you can access