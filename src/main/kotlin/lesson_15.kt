fun main() {

    val bike: Bike = Bike()
    val carOther = CarOther()



}


/*
Различие абстрактного класса от интерфейса в Kotlin в том что у интерфейса нет Конструктора
Интересная идея с абстрактными полями
 */

interface Movebale {

    val URL: String
    fun move()

    fun info()

}




// abstract class


class CarOther: Vechicle() {
    override val wheel: Int = 4

    override fun move() {
        println("Завожу мотор")
    }
}

class Bike: Vechicle() {
    override val wheel: Int = 2

    override fun move() {

        println("Кручу педали")
    }
}

abstract class Vechicle {

    abstract val wheel: Int

    val nfgnfg: Int = 27

    fun info() {

        println("It's transport have wheel count - $wheel")

    }

    abstract fun move()




}