

fun add(a: Int, b: Int) {
    println("Result of $a + $b is ${a + b}")
}



fun addValues(i: Int, j: Int): Int {
    val k = i + j
    return k
}


fun main (args: Array<String>) {
    add (7,2)
    var sum=addValues(7,8)
    println(sum)
}

