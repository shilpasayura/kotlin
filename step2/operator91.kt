// referential equation
class Point {
    var pointX : Int = 0
    var pointY : Int = 0
}

fun main(a : Array <String>) {
    val p1 = Point()
    p1.pointX = 10
    p1.pointY = 20
    val p2 = Point()
    p2.pointX = 30
    p2.pointY = 40
    println(p1 === p2) // false
    println(p1 !== p2) // true
    var p3 = p1
    println(p1 === p3) // true
}
