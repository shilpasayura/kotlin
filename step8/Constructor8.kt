// Product class with two secondary constructor
class Product(name: String, category: String) {

    val name: String
    val category: String
    var price : Double
    var quantity : Int

    init {
        this.name = name
        this.category = category
        this.price = 0.0
        this.quantity = 0
        println(" Initializer Block called")
    }

    constructor(name: String, category: String, price: Double) : this(name, category){
        this.price = price
        println("first constructor called")
    }

    constructor(name: String, category: String, price: Double, quantity: Int) : this(name, category, price){
        this.quantity = quantity
        println("second constructor called")
    }
}

fun main(args: Array<String>) {
    val audioPlayer = Product("MP3 Player","Electronics")
    println("Product name = ${audioPlayer.name}, Category = ${audioPlayer.category}, Price = ${audioPlayer.price}$ and Available Quantity = ${audioPlayer.quantity}")

    val flashRam = Product("Flash Ram","Electronics", 35.0)
    println("Product name = ${flashRam.name}, Category = ${flashRam.category}, Price = ${flashRam.price}$ and Available Quantity = ${audioPlayer.quantity}")

    val toy = Product("Teddy Bear","Toy", 10.0, 54)
    println("Product name = ${toy.name}, Category = ${toy.category}, Price = ${toy.price}$ and Available Quantity = ${toy.quantity}")
}