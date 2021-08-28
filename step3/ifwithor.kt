// if with or

fun main(args: Array<String>) {

    val studentAttendance = 5
    val studentAssignment = 10
    val studentExamination = 30

    val studentMarks = studentAttendance + studentAssignment + studentExamination

    var grade = ""

    if((studentAttendance < 5 ) or (studentAssignment < 10 ) or (studentExamination < 30)) {

        grade = "F"
    }
    else {

        if (studentMarks >= 90) {
            grade = "A"
        } else if (studentMarks >= 80) {
            grade = "B"
        } else if (studentMarks >= 70) {
            grade = "D"
        } else if (studentMarks >= 60) {
            grade = "C"
        } else if (studentMarks >= 50) {
            grade = "D"
        } else {
            grade = "E"
        }
    }

    println ( "Student achieved " + grade )
}
