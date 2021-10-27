import org.scalatest.{Matchers, WordSpec}

class MainTest extends WordSpec with Matchers {
  "A Person" should {
    "be instantiated with a age and name" in {
      val john = Person(firstName = "Tobias", lastName = "Pappert", 28)
      john.firstName should be("Tobias")
      john.lastName should be("Pappert")
      john.age should be(28)
    }
    "Get a human representation of the person" in {
      val paul = Person(firstName = "Fredy", lastName = "Jobst", age = 24)
      paul.description should be("Fredy Jobst is 24 years old")
    }
  }
  "The Person companion object" should {
    val (Anouar, Abdennacer, Badr, Faical) = (
      Person(firstName = "Anouar", lastName = "Asmai", age = 23),
      Person(firstName = "Abdennacer", lastName = "Elmaalem", age = 24),
      Person(firstName = "Badr", lastName = "Kacemi", age = 17),
      Person(firstName = "Faical", lastName = "Asmai", age = 27)
    )
    "return a list of adult person" in {
      val ref = List(Anouar, Abdennacer, Badr, Faical)
      Person.filterAdult(ref) should be(List(Anouar, Abdennacer, Faical))
    }
    "return an empty list if no adult in the list" in {
      val ref = List(Badr)
      Person.filterAdult(ref) should be(List.empty[Person])
    }

    "shows if the person with this first name is in the list" in {
      val ref = List(Anouar, Abdennacer, Badr, Faical)
      Person.findByFirstName(ref, "Anouar") should include("The person with the first name Anouar is in the list of persons")
    }

    "shows if the person with this last name is in the list" in {
      val ref = List(Anouar, Abdennacer, Badr, Faical)
      Person.findByLastName(ref, "Asmai") should include("The person with the first name Anouar is in the list of persons")
    }
  }
}
