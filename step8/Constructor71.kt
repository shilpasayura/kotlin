/*
Calling one secondary constructor from another –
A secondary constructor may call another secondary constructor of the same class using this() function.
 */

//main function
fun main(args: Array<String>)
{
    Addz(5,6)
}
class Addz {
    // calling another secondary using this
    constructor(a: Int,b:Int) : this(a,b,7) {
        var sumOfTwo = a + b
        println("The sum of two numbers 5 and 6 is: $sumOfTwo")
    }
    // this executes first
    constructor(a: Int, b: Int,c: Int) {
        var sumOfThree = a + b + c
        println("The sum of three numbers 5,6 and 7 is: $sumOfThree")
    }
}
