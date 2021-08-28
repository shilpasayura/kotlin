// Increment operator
fun main(args: Array<String>) {
    var j = 0
    var i = 1
    j = i++
    println("Value of i = $i")
    println("Value of j = $j")
    i = 1
    j = ++i
    println("Value of i = $i")
    println("Value of j = $j")
    i.inc()
    j.inc()
    println("Value of i = $i")
    println("Value of j = $j")
}
