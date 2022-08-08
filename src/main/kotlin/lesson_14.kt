fun main() {

    // public private protected

    val laptop = Laptop("Mechanical")

    laptop.yrt = 22

    println(laptop.yrt)
}

fun otherPoroh() {}


class Laptop (private val keyboard: String) {

    private var some: String = ""
        get() { return field }
        //set(some: String) {this.some = some}

    private val otherSome: String = ""
        get() {return field}

    var yrt: Int = 0
        get() = field


    fun doSome() {

        yrt = 50
        some = "dgfsd"
    }

}

annotation class Urka {}

open class Furniture {}
class Chair: Furniture() {}
class Table: Furniture() {}
