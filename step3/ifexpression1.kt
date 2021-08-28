// if as an expression

fun main(args: Array<String>) {

    val studentMarks = 70

    var grade = if (studentMarks >= 90) {
        "A"
    }else if (studentMarks >= 80) {
        "B"
    } else if (studentMarks >= 70) {
        "C"
    } else if (studentMarks >= 60) {
        "D"
    } else {
        "F"
    }
    println ( "Student achieved " + grade )
}
