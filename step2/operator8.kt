//bit shifting

fun main(args: Array<String>) {

    var number = 5
    var count = 1

    var result = number.shl(count)
    println("$number : After Left shift $count times = $result")

    count = 3
    result = number shl count
    println("$number : After Left shift $count times = $result")

    number = 5
    count = 1

    result = number.shr(count)
    println("$number : After Right shift $count times = $result")

    count = 2

    result = number shr count
    println("$number : Right shift $count times = $result")

    number = -1
    count = 1

    result = number shr count
    println("$number : After Right shift $count times = $result")

    result = number ushr count
    println("$number : Unsigned right shift $count times = $result")

}
