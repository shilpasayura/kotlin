//main function
fun main(args: Array<String>) {
    Add(5, 6)
    Add(5, 6, 7)
    Add(5, 6, 7, 8)
}
//class with three secondary constructors
class Add {
    constructor(a: Int, b: Int)
    {
        var c = a + b
        println("Sum of 5, 6 = ${c}")
    }
    constructor(a: Int, b: Int, c: Int) {
        var d = a + b + c
        println("Sum of 5, 6, 7 = ${d}")
    }
    constructor(a: Int, b: Int, c: Int, d: Int) {
        var e = a + b + c + d
        println("Sum of 5, 6, 7, 8 = ${e}")
    }
}
