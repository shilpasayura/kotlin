
// Simplest form of Function

fun hello(): Unit {
    println("Hello from Kotlin")
}

fun hello(name: String): Unit {
    println("Hello from $name")
}


fun main (args: Array<String>) {
    hello()
    hello("Ama")
}
