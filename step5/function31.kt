
// collection as a parameter
fun displayCollection(list: List<String>): Unit {

    for (item in list) {
        println(item)
    }
}

fun addItems(list: List<Int>): Unit {

    var total = 0
    for (item in list) {
        total += item
    }
    println("Total $total")
}

fun main(args: Array<String>) {
//list is immutable and its methods supports only read functionalities.

    var xlist = listOf("Ama","Bima","Cima")//read only, fix-size
    displayCollection (xlist)
    var ylist =listOf(1,2,3,4,5)
    addItems(ylist)
}
