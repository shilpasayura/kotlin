fun main(args: Array<String>) {

    var notNull : String = "Hello"
    //notNull = null // not allowed

    var len  = notNull.length
    println("Value is $notNull and length is ${notNull.length} ")

    var mayBeNull : String?
    mayBeNull = null // allowed
}

