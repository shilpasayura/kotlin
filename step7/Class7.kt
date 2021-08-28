// equals operator
data class PersonB(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {

    val P1 = Person("Ama", 17, 5.4)
    val P2 = Person("Ama", 17, 5.4)
    val P3 = Person("Bima", 19, 5.3)
    val P4=P1

    if (P1 == P2) {
        println("P1 and P2 persons are same")
    } else {
        println("P1 and P2 are different persons")
    }

    if (P1.equals(P2)) {
        println("P1 and P2 persons are same")
    } else {
        println("P1 and P2 are different persons")
    }

    if (!(P1.equals(P3))) {
        println("P1 and P3 are different persons")
    }
    if (P1.equals(P4)) {
        println("P1 and P4 persons are same")
    }
}