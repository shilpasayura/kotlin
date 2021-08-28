//Referential equality & Structural equality

fun main(args: Array<String>) {
    val a = Integer(20)
    val b = Integer(20)
    var result = a === b // Pointing to different memory
    println("Referential equality " + result)
    val c = a
    result = a === c // pointing to the same memory
    println("Referential equality " + result)
    result = a == b // Values are same
    println("Structural equality " + result)
}

