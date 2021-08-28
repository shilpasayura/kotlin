// vararg declaration
fun trickyVararg02(vararg list: Int, a: Int, b: Int) {

    var total = 0

    for (item in list) {
        print("$item " )
        total += item
    }
    println()
    println("Total $total")
    println("a = $a , b = $b")
}

fun main (args: Array<String>) {
    trickyVararg02(1,2,3,a=4, b=5)
}
