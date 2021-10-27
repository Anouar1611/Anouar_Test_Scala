case class Person(firstName: String, lastName: String, age: Int) {
  def description = s"$firstName $lastName is $age ${if (age <= 1) "year" else "years"} old"
}

object Person {
  def filterAdult(persons: List[Person]) : List[Person] = {
    persons.filter(_.age >= 18)
  }

  def findByFirstName(persons: List[Person], firstName1: String): Unit = {
    for(person <- persons)
      if (person.firstName.equals(firstName1)==true) {
      println("The person with the first name " + firstName1 + " is in the list of persons")
      println()
      }
  }

  def findByLastName(persons: List[Person], lastName1: String): Unit = {
    for(person <- persons)
      if (person.lastName.equals(lastName1)==true) {
        println("The person with the last name " + lastName1 + " is in the list of persons\n")
      }

  }


}
