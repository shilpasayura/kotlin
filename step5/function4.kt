fun sumOfNumbers(vararg numbers: Double) {
    var sum: Double = 0.0
    for(number in numbers) {
        sum += number
    }
    println(sum)
}

fun main(args: Array<String>) {
    sumOfNumbers(1.5, 2.0)  // Result = 3.5

    sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2)  // Result = 23.0

    sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2, 8.1, 12.4, 16.5)  // Result = 60.0
}