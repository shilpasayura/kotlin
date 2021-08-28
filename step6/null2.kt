// Safe call with null
fun main(args: Array<String>) {

    var mayBeNull : String?  // this can be null
    mayBeNull = null // allowed
    //mayBeNull="Hello"
    var mayBeLen = 0
    if(mayBeNull != null && mayBeNull.length > 0) {
        mayBeLen = mayBeNull.length
    }
    // Safe Call
    var length = mayBeNull?.length
    println("value of length is " + length)
}