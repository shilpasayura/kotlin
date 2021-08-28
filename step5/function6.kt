// vararg list of different data types
fun mixedVars01(vararg list: Any) {

    for (item in list) {
        if (item is String) {
            println("$item is String")
        }
        else if (item is Int){
            println("$item is Integer")
        }
        else if (item is Float) {
            println("$item is Float")
        }
        else if (item is Double) {
            println("$item is Double")
        }
        else {
            println("$item is Alian")
        }
    }
}


fun mixedVars02(vararg list: Any) {

    for (item in list) {

        when (item){
            1 -> println("$item is One")
            in 2..7 -> println("$item is Between 2 and 7")

            is Double ->println("$item is Double type")
            is String ->println("$item is String type")

            is Float ->println("$item is Float type")
            else -> println("$item is Alian")
        }

    }
}

fun main(args: Array<String>) {
    mixedVars01(1.1, 2, "Three", 8.0F,1, "Five", 6)
    mixedVars02(1.1, 2, "Three", 8.0F,1, "Five", 6)
}
