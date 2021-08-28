// Sure operator
fun main(args: Array<String>) {

    var sureNotNull : String? = null
    /*
    var length = sureNotNull!!.length // application will be crashed
    println("value of length is " + length)
    */
    var ch1 : Char? = "abc".lastOrNull()
    //var ch1 : Char = "abc".lastOrNull()

    var ch2 : Char = "xyz".lastOrNull()!!
    println("ch1 = $ch1 and ch2 = $ch2")
}