// Primary constructor with init block.
class Personq(pName: String, pAge: Int, pHeight : Double ) {

    var name : String
    var age : Int
    var height : Double

    init {
        name = pName
        age  = pAge
        height = pHeight
        require(name.trim().isNotEmpty()) {"Name should not empty"}
        require(age > 0 ) {"Age is not correct"}
        require(height > 0) {"Height is not correct"}
        print("Hello")
    }
}

fun main(args: Array<String>) {

    val person = Personq("Ama",17,5.5)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
    val person1 = Personq("Bima",0,0.0)
}


