


fun main (args: Array<String>){

    // Smart cast with Parent class Any
    var any : Any? = null
    any = 1234 // integer
    any = "Hello" // String
    any = 123.456 // Double

    mySmartCast(8)
    mySmartCast("Kotlin")
    mySmartCast(null)

    myUnsafeCast("Hello unsafe")
    myUnsafeCast(null)
    myUnsafeCast(2)

}

fun myUnsafeCast(any : Any?){
    // This is fine but will throw ClassCastException if value is not string, Add make the string nullable String?
    //val s : String = any as String
    val s : String? = any as? String
    println(s)
}


fun mySmartCast(any :Any?){
    if(any is Int){
        var i = any + 5
        println("Value is Int $i")
    }
    else if(any is String){
        var s = "Hello " + any
        println("Value is String $s")
    }
    else if (any == null) {
        println("Object is null")
    }
}