fun main(args: Array<String>) {
    val grade = "c"
    when (grade) {
        "A","a" -> println("Excellent")
        "B","b" -> println("Very Good")
        "C","c" -> println("Nice work")
        "D","d" -> println("OK")
        "E","e" -> println("Hmmm")
        "F","f" -> println("Better luck next time")
        else -> println("Invalid input")
    }
}
