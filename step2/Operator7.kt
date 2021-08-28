// xor operator 2

fun main(a : Array <String>) {
    var i : Boolean = true
    var j : Boolean = false
    var result : Boolean
    result = i xor j
    println ("$i XOR $j = $result")
    i = true
    j = true
    result = i xor j
    println ("$i XOR $j = $result")
    i = false
    j = false
    result = i xor j
    println ("$i XOR $j = $result")
}
