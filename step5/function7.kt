// Pair represents two values
fun timeConversion(seconds: Int): Pair<Int,Int> {

    val hour = seconds/3600
    val minutes = (seconds % 3600) / 60

    return Pair(hour,minutes)
}

fun main(args: Array<String>) {

    val myPair : Pair<Int,Int> = timeConversion(5000)
    println("${myPair.first} Hour(s) ${myPair.second} Minute(s)")
    val (hh,min) = timeConversion(17000)
    println("$hh Hour(s) $min Minute(s)")

}
