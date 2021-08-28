// Copy function - 1
class PersonC(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {

    val P1 = PersonC("Ama", 40, 6.0)
    val P2 = P1

    println(P1.name) //Print P1 name
    P2.name = "Bima" // Update P2 name
    println(P1.name) // Print P1 name
    println("Objects are pointing to the same memory locations = ${P1 === P2}")

    if(P1 == P2) {
        println("Both Persons are same")
    }
}

