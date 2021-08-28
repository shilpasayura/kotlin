// Constructor with default parameter
class Persons(val name: String, var age: Int = 0, var height : Double = 0.0, var weight : Double = 0.0)

fun main(args: Array<String>) {


    val p1 = Persons("Ama")
    println("name ${p1.name}, age ${p1.age}, height ${p1.height}")

    val p2 = Persons("Bima", 16)
    println("name ${p2.name}, age ${p2.age}, height ${p2.height}")

    val p3 = Persons("Cima", 14, 5.3)
    println("name ${p3.name}, age ${p3.age}, height ${p3.height}")

    val px = Persons("Uma", 14, 5.3, 58.2)
    println("name ${px.name}, age ${px.age}, height ${px.height}, weight ${px.weight}")

    // named parameters
    val p4 = Persons(name = "Duma", age = 19, height = 5.1, weight = 87.5)
    println("name ${p4.name}, age ${p4.age}, height ${p4.height}, weight ${p4.weight}")

    // named parameters without any order
    val p5 = Persons(weight = 73.5, age = 17, name = "Ema", height = 5.3)
    println("name ${p5.name}, age ${p5.age}, height ${p5.height}, weight ${p5.weight}")
}
