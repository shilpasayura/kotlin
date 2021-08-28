// For loop
fun main(args: Array<String>) {

    println("\nRange")
    var range = 1..3
    for (i in range) {
        println("value of $i")
    }

    println("\nList")
    val list = listOf(1,2,3,4)
    for (l in list){
        println("value of $l")
    }

    println("\nString")
    val message = "kotlin is awesome"
    for (m in message){
        println(m)
    }
}
