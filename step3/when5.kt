fun main(args: Array<String>) {

    val grade = "B"

    val remarks = when (grade) {

        "A","a" -> "Excellent"
        "B","b" -> "Very Good"
        "C","c" -> "Nice work"
        "D","d" -> "OK"
        "E","e" -> "Hmmm"
        "F","f" -> "Better luck next time"
        else -> "Invalid input"
    }

    println(remarks)

}
