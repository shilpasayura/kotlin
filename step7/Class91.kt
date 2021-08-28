// Hash code

//class PersonF(var name : String, var age: Int, var height: Double)
data class PersonF(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    val p1 = Person("Ama", 17, 5.4)
    val p2 = Person("Ama", 17, 5.4)
    val p3 = Person("Khan", 17, 5.4)

    val set = hashSetOf(p1,p2,p3)
    println("Set contains ${set.size} elements")

    val result = set.contains(Person("Ama",14,5.4))
    println("Search result = $result")
}
