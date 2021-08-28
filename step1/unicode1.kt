// Display UniCode characters
fun displayUniCode() {

    var ch : Char = '\u0030'

    var i = 0;
    while (i < 81){
        println("$i ${ch++}")
        i++
    }
    var su : Char = '\u0D80'
    for(i in 3461..3551){
        println("$i ${su++}")
    }
}

fun main(args: Array<String>) {

    displayUniCode()

}