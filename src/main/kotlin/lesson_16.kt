import kotlin.system.exitProcess

fun main() {


    val scanner = Scanner()

    scanner.scanningValue()
    scanner.check()

    val action = Action()

    action.handlerCity(scanner)
    action.handlerCoffee(scanner)

    action.checkForBiscuit()


}

class Scanner {

    var city = ""
    var coffee = ""

    fun scanningValue() {

        println("Choose city:")
        println("1. Moscow\n2. New York")

        city = readln()

        println("Choose coffee:")
        println("1. Americano\n2. Cappuchino\n3. Latte")

        coffee = readln()

    }

    fun check() {

        if (city == "1" || city == "2")
            println("-")
        else {
            errorMessage()
        }
        if (coffee == "1" || coffee == "2" || coffee == "3")
            println("--")
        else {
            errorMessage()
        }

    }

    private fun errorMessage() {

        println("Error")
        exitProcess(1)
    }


}

class Action {

    private var currentCoffeeShop: CoffeeShop? = null


    fun handlerCity(scanner: Scanner) {

        when (scanner.city) {

            "1" -> currentCoffeeShop = MoscowCoffeeShop(5.0,2.2,4.5)
            "2" -> currentCoffeeShop = NewYorkCoffeeShop(6.9,8.0,5.8)

        }

    }
    fun handlerCoffee(scanner: Scanner) {

        when (scanner.coffee) {

            "1" -> currentCoffeeShop?.makeAmericano() ?: buildString {
        append("null in 64 str")
    }
            "2" -> currentCoffeeShop?.makeCappuchino() ?: buildString {
        append("null in 65 str")
    }
            "3" -> currentCoffeeShop?.makeLatte() ?: buildString {
        append("null in 66 str")
    }
        }
    }

    fun checkForBiscuit() {

        if (currentCoffeeShop is MoscowCoffeeShop) {
            (currentCoffeeShop as MoscowCoffeeShop)?.sellBiscuit()
        }
        else {
            exitProcess(0)
        }

    }


}


abstract class CoffeeShop(
    private val americanoPrice: Double,
    private val cappuchinoPrice: Double,
    private val lattePrice: Double ) {


    var countAmericano = 0
    var countCappuchino = 0
    var countLatte = 0


    abstract fun makeAmericano()
    abstract fun makeCappuchino()
    abstract fun makeLatte()

}

class MoscowCoffeeShop(americanoPrice: Double, cappuchinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuchinoPrice, lattePrice), Biscuit {

    override fun makeAmericano() {
        countAmericano++
        println("Thank for order Americano Coffee in Moscow")

    }

    override fun makeCappuchino() {
        countCappuchino++
        println("Thank for order Cappuchino Coffee in Moscow")

    }

    override fun makeLatte() {
        countLatte++
        println("Thank for order Latte Coffee in Moscow")

    }

    override fun sellBiscuit() {

        println("Would you like cuckie")
        println("1. Yes\n2. No")

        val result = readln()

        if (result == "1")
            println("Take your cockie")
        else
            exitProcess(0)
    }
}

class NewYorkCoffeeShop( americanoPrice: Double, capuchinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, capuchinoPrice, lattePrice) {

    override fun makeAmericano() {
        countAmericano++
        println("Thank for order Americano Coffee in NewYork")

    }

    override fun makeCappuchino() {
        countCappuchino++
        println("Thank for order Cappuchino Coffee in NewYork")

    }

    override fun makeLatte() {
        countLatte++
        println("Thank for order Latte Coffee in NewYork")

    }
}

interface Biscuit {

    fun sellBiscuit()

}