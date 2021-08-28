// Person class with One secondary constructor
class PersonM(name: String, age: Int) {
    var name : String
    var age : Int
    var height : Double

    init {
        this.name = name
        this.age  = age
        this.height = 0.0
    }

    constructor(name: String, age: Int, height: Double) : this(name, age) {
        this.height = height
    }
}

fun main(args: Array<String>) {

    val p1 = PersonM("Ama", 17, 5.4)
    println("Name ${p1.name}, Age ${p1.age}, Height ${p1.height}")
}


