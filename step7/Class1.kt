class Person (val name: String, var age : Int , var height : Double){

    fun speak(){
        println("My name is $name , i am $age years old and I am $height feet tall")
    }

    fun sleep(){
        println("Zzzzzzz....")
    }

    fun eat(){
        println("I am eating a delicious vegetarian disk")
    }

    fun info() : String {
        return "My name is $name , i am $age years old and I am $height feet tall"
    }

    fun greet(message : String){
        println("Hi I am $name.... $message")
    }
}

fun main(args: Array<String>) {

    var ama = PersonN("Ama", 17, 5.5)
    ama.greet("Nice to meet you!!!")
    var text = ama.info()
    println(text)

    var bima = PersonN("Bima", 16, 5.4)
    ama.greet("Hi, How are you")
    text = bima.info()
    println(text)
}
