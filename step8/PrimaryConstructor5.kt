// this keyword
class Personr(name: String, age: Int, height : Double ) {
    var name : String
    var age : Int
    var height : Double

    init {
        this.name = name
        this.age  = age
        this.height = height
    }
}

fun main(args: Array<String>) {
    val person = Personr("Ama",17,5.4)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
}