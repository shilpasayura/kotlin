// if else if

fun main (arge:Array<String>){
    val studentMarks = 90
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
}

