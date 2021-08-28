fun main ( arge : Array <String> ) {

    val speedLimit1 = 1..49
    val speedLimit2 = 50..59
    val speedLimit3 = 60..69

    var speed = 65

    if(speed in speedLimit1){
        println("Nice driving")
    }
    else if(speed in speedLimit2){
        println("You are exceeding the limit, fine payable $10")
    }
    else if(speed in speedLimit3){
        println("Warning.. reduce your speed. fine payable $30")
    }
    else {
        println("Your driver's license is canceled. fine payable $75")
    }

    if(speed !in 0..70) {
        println("Your driver's license is canceled. fine payable $75")
    }

}
