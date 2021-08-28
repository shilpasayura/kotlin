// Copy function - 2

data class PersonD(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    // Create new instance by using copy function
    val P1 = PersonD("Abid", 40, 6.0)
    val P2 = P1.copy()

    println(P1) //Print Abid
    P2.name = "Bima" // Update Khan name
    println(P1) // Print Abid
    println("-----------------------------")
    println("Are Ama and Bima objects pointing to the same memory locations = ${P1 === P2}")
    println("-----------------------------")
    // Add new values into copied object.
    val P3 = P1.copy("Bob")
    println(P3)
    val P4 = P1.copy(name = "Cima", height = 5.9)
    println(P4)
}
