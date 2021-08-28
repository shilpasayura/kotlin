fun currencyExchange(dollar: Double, currencyRate: Double, charges: Double = 5.0): Double {

    var total = dollar * currencyRate

    var fees = total * charges / 100

    total = total - fees

    return total
}

fun main(args: Array<String>) {
    val usd : Double = 110.00
    val rate : Double = 213.00
    val charge: Double=50.00
    val usdTolkr : Double = currencyExchange(usd, rate, charge)
    print("USD $usd is LKR $usdTolkr at LKR $rate")
    }