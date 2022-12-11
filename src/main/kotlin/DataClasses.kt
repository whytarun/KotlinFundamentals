import java.time.LocalDate

fun main(){
    val p1 =Person(1, "tar")
    val p2 =Person(1, "tar")
    println(p1) //.tostring
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)

    val lst = setOf<Person>(
        Person(1, "tar"),
        Person(1, "tar")
    )

    val t1 = PersonV1("Amanda", "Smith").also {
        it.dateOfBirth = LocalDate.of(1992, 8, 8)
    }
    val t2 = PersonV1("Amanda", "Smith").also {
        it.dateOfBirth = LocalDate.of(1976, 11, 18)
    }
   // println(t1 == t2)


    val d1 = PersonV2("Amanda", "Smith").also { it.dateOfBirth = LocalDate.of(1992, 8, 8) }
    val d2 = PersonV2("Amanda", "Smith").also { it.dateOfBirth = LocalDate.of(1976, 11, 18) }
    println( "===overide the equal$ d1 == d2" )
    println(  d1 == d2 )

}

/*
    1. to store the data we use of dataclass
    2. equal, hashcode, tostring  method are generate automatically because it inherits  from 'Any' class
    3. java we use to add boilerplate code for
    each variable getter and setter
 */

class Person(val id :Int, val Name :String)

data class Person1(val firstname: String, val lastname: String)

data class PersonV1(val firstname: String, val lastname: String) {
    lateinit var dateOfBirth: LocalDate
}

data class PersonV2(val firstname: String, val lastname: String) {
    lateinit var dateOfBirth: LocalDate

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersonV2) return false

        if (firstname != other.firstname) return false
        if (lastname != other.lastname) return false
        if (dateOfBirth != other.dateOfBirth) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstname.hashCode()
        result = 31 * result + lastname.hashCode()
        result = 31 * result + dateOfBirth.hashCode()
        return result
    }

}

