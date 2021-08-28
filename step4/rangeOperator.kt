// range operator

fun main ( arge : Array <String> ) {

    var speed = 45
    if(speed > 0 && speed < 50){
        println("Nice driving")

    } else if(speed >= 50 && speed < 60){
        println("You are exceeding the limit, fine payable $10")
    }
    else if(speed >= 60 && speed < 70){
        println("Warning.. reduce your speed. fine payable $30")
    }
    else {
        println("Your driver's license is canceled. fine payable $75")
    }
}
