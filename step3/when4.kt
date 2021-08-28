fun main(args: Array<String>) {

    val grade = "E"
    when (grade) {
        in "A".."E" -> println("You are promoted to the next level")
        "F" -> println("You need hard work.")
        else -> println("Invalid input")
    }
}
