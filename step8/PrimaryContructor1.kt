// Default constructor
class Personx {
    var name: String = "Ama"
    var age : Int = 17
    var height : Double = 5.4
}

fun main(args: Array<String>) {
    val person01 = Personx()
    println("Name ${person01.name}, Age ${person01.age} Height ${person01.height}")

    val person02 = Personx()
    println("Name ${person02.name}, Age ${person02.age} Height ${person02.height}")

    person02.name = "Bima"
    person02.age = 16

    println("Name ${person02.name}, Age ${person02.age} Height ${person02.height}")
}
