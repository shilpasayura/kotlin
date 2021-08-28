


fun areaOfCircle(radius: Double): Double {
    val area = Math.PI * radius * radius
    return area
}

fun getMax(x: Int, y: Int): Int {

    if (x >= y) {
        return x
    } else {
        return y
    }
}

// Function with default arguments
fun hello_(message: String = "Kotlin"): Unit {
    println("Hello $message")
}


fun main(){
    val area =areaOfCircle(7.87)
    val i= getMax(72, 23)
}
