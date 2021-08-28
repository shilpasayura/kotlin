// Break statement
fun main(args: Array<String>) {

    for (i in 1..10) {

        println("For $i")
        if(i >= 5) {
            break;
        }
    }

    var i = 1
    while (i <= 10) {

        println("While $i")
        if(i >= 5) {
            break;
        }
        i++
    }

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i , $j")
            if(i==j) {
                break;
            }
        }
    }
}
