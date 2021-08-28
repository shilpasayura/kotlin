fun main(args: Array<String>) {

    val studentMarks = 85

    val grade = when (studentMarks) {
        in 90..100 -> {
            "A"
        }
        in 80..89 -> {
            "B"
        }
        in 70..79 -> {
            "C"
        }
        in 60..69 -> {
            "D"
        }
        in 50..59 -> {
            "E"
        }
        else -> {
            "F"
        }
    }

    println(grade)
}
