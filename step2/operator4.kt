// combination operators AND
// greater than and smaller than
fun main(a : Array <String>) {
    var i : Boolean = true
    var j : Boolean = false
    var k : Boolean = true
    var result : Boolean
    result = i && j
    println ("$i AND $j = $result")
    result = i and k
    println ("$i AND $k = $result")
    var a = 40
    var b = 20
    var c = 10
    if ((a > b) and (a > c)) {
        println("a is a winner")
    }
}

