


fun main(args: Array<String>) {

    val studentMarks = 59
    var grade = ""

    if (studentMarks >= 90) {
        grade = "A"
    } else if (studentMarks >= 80) {
        grade = "B"
    } else if (studentMarks >= 70) {
        grade = "C"
    } else if (studentMarks >= 60) {
        grade = "D"
    } else {
        grade = "F"
    }

    println ( "Student achieved " + grade )

    if(grade != "F") {
        println("Congratulation you have passed the course")
    } else {
        println("Fail… Better luck next time")
    }

}
