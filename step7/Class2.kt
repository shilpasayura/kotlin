// outer class declaration
class outerClass1 {
    var str = "Outer class"
    // nested class declaration
    class nestedClass1 {
        val firstName = "Ama"
        val lastName = "Perera"
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    print(outerClass1.nestedClass1().firstName)
    print(" ")
    println(outerClass1.nestedClass1().lastName)
}