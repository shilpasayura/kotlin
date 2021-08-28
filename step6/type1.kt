fun main (args: Array<String>){
    // Create a byte value
    var byteValue : Byte = 10
    var anotherByteValue : Byte = byteValue

    println ("byteValue is $byteValue and anotherByteValue is $anotherByteValue")


    var intValue : Int

    // Not allowed
    // intValue = byteValue
    // Not allowed as well
    // intValue = (Int) byteValue
    // Byte to Int

    intValue = byteValue.toInt()
    println("int from byte is $intValue")

    // Double to Int
    var doubleValue : Double = 12.345
    intValue = doubleValue.toInt()
    println("int from double is $intValue")

    byteValue = intValue.toByte()
    println("byte from int is $byteValue")

    // String to Int
    // it is also possible to cast from string to number values.
    // Will throw NumberFormateException if target string does not contain number.

    var stringValue : String = "125"
    intValue = stringValue.toInt()
    println("intValue from stringValue is $intValue")

    // What if the String does not contain valid number. Use Safe Call
    stringValue = "12A"
    var i :Int? = stringValue.toIntOrNull()

    if(i is Int)  {
        println("int from string is $i")
    }
    else{
        println("not a valid String")
    }

    if(i !is Int){
        println("not a valid String")
    }
    else{
        println("intValue from stringValue is $i")
    }
}
