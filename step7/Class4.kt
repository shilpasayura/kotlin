// outer class declaration
class OuterClass2 {
    var str = "Outer class"
    // innerClass declaration with using inner keyword
    inner class InnerClass2 {
        var s1 = "Inner class 2"
        fun nestfunc(): String {
            // can access the outer class property str
            var s2 = str
            return s2
        }
    }
}
// main function
fun main(args: Array<String>) {
    // creating object for inner class
    val inner= OuterClass2().InnerClass2()
    // inner function call using object
    println(inner.nestfunc()+" property accessed successfully from inner class ")
}
