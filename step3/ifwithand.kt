//if with and

fun main ( arge : Array <String> ) {

    val studentMarks = 66
    var grade = ""
    if (studentMarks >= 96) {
        grade = "A+"
    } else if (studentMarks >= 90 && studentMarks < 96){
        grade = "A"
    } else if (studentMarks >= 86 && studentMarks < 90){
        grade = "B+"
    } else if (studentMarks >= 80 && studentMarks < 86){
        grade = "B"
    } else if (studentMarks >= 76 && studentMarks < 80){
        grade = "C+"
    } else if (studentMarks >= 70 && studentMarks < 76){
        grade = "C"
    } else if (studentMarks >= 66 && studentMarks < 70){
        grade = "D+"
    } else if (studentMarks >= 60 && studentMarks < 66){
        grade = "D"
    } else {
        grade = "F"
    }
    println ( "Student achieved " + grade )
}
