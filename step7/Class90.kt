// Decompose
data class PersonE(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {
    val P1 = PersonE("Ama", 17, 5.4)
    val (name, age, height) = P1
    println("name=${P1.component1()} " +
            "age=${P1.component2()} " +
            "height=${P1.component3()}")
}
