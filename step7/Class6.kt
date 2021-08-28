//main purpose is to hold data
data class PersonA(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    val person = PersonA("Ama", 17, 5.4)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
//    println(person)
    println(person.toString())
}

