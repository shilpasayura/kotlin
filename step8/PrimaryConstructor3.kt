// Primary constructor with constructor parameters.
class Personp (pName: String, pAge: Int, pHeight: Double) {

    val name: String = pName
    var age: Int = pAge
    var height : Double = pHeight
}

fun main(args: Array<String>) {
    val person = PersonN("Ama",17,5.4)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
}
