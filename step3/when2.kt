fun main(args: Array<String>) {

    val grade = "B"
    when (grade) {
        "A" -> println("Excellent")
        "B" -> println("Very Good")
        "C" -> println("Nice work")
        "D" -> println("OK")
        "E" -> println("Hmmm")
        "F" -> println("Better luck next time")
        else -> println("Invalid input")
    }
}
