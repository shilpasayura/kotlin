
// Elvis operator
fun main(args: Array<String>) {
    var mayBeNull : String? = null
    var length = mayBeNull?.length ?: 0
    println("value of length is " + length)

    mayBeNull = "Hello"

    length = mayBeNull?.length ?: 0
    println("value of length is " + length)
}
