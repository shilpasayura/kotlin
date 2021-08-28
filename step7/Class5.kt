class Calculator{
    fun add(v1 : Int, v2 : Int) = v1 + v2
    fun add(v1 : Double, v2 : Double) = v1 + v2
    fun add(v1 : Float, v2 : Float) = v1 + v2
    fun max(v1 : Int, v2 : Int) = if (v1 >= v2) {
        v1
    } else {
        v2
    }

    fun max(v1 : Double, v2 : Double) = if (v1 >= v2) {
        v1
    } else {
        v2
    }
}

fun main(args: Array<String>) {
    val calc = Calculator()
    println(calc.add(2,2))
    println(calc.add(3.0,3.0))
    println(calc.add(4.0f,4.0f))
    println("MAX "+ calc.max(3,4))
}