// Triple represents a triad of values
fun timeConversionTriple(seconds: Int): Triple<Int,Int,Int> {
    val hour = seconds/3600
    val minutes = (seconds % 3600) / 60
    val sec =  seconds % 60
    return Triple(hour,minutes, sec)
}

fun display(myTriple: Triple<Int,Int,Int>) {
    println("${myTriple.first} Hour(s) ${myTriple.second} Minute(s) ${myTriple.third} Second(s)")
}

fun main(args: Array<String>) {
    val myTriple = timeConversionTriple(10512)
    display(myTriple)
}

