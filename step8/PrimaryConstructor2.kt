// Primary constructor
class Personz (val name: String, var age: Int, var height : Double)

// Primary constructor with constructor keyword
// class Person constructor(val name: String, var age: Int, var height : Double)

fun main(args: Array<String>) {

    val person1= Personz("Ama", 17, 5.4)
    println("Name ${person1.name}, Age ${person1.age} Height ${person1.height}")

    val person2 = Personz("Bima", 16, 5.5)
    println("Name ${person2.name}, Age ${person2.age} Height ${person2.height}")
}
