//Labled for loop with break statement

fun main(args: Array<String>) {

    println("For Loop")
    for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break
            }
            println("$i , $j")
        }
    }


    println("Labled For Loop")
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break@outLoop
            }
            println("$i , $j")
        }
    }
}
