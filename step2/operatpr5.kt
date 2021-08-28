// or operator

fun main(a : Array <String>) {
    var i : Boolean = true
    var j : Boolean = false
    var k : Boolean = true
    var result : Boolean
    result = i || j
    println ("$i OR $j = $result")
    result = i or k
    println ("$i OR $k = $result")
    var a = 40
    var b = 20
    var c = 10
    if ((a > b) or (a > c)) {
        println("a is a winner")
    }
}
