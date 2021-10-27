object Main extends App {

  val persons = List(

    Person(firstName = "Anouar", lastName = "Asmai", age = 23),
    Person(firstName = "Abdennacer", lastName = "Elmaalem", age = 24),
    Person(firstName = "Badr", lastName = "Kacemi", age = 17),
    Person(firstName = "Faical", lastName = "Asmai", age = 27))

  val firstName = "Anouar"
  val lastName = "Asmai"
  val adultPersons = Person.filterAdult(persons)

  val personfirstName = Person.findByFirstName(persons, firstName)

  val personlastName = Person.findByLastName(persons, lastName)

  val informations = adultPersons.map(p => p.description).mkString("\n\t")
  println(s"The adult persons are : \n\t $informations")
}
