fun main() {

    val dog = Dog()

    dog.sound()
}


class Dog: Animal() {

    override fun sound() {
        println("Dog sound")
    }

}
class Cat: Animal() {

    override fun sound() {
        println("Cat sound")
    }


}

open class Animal {


    open fun sound() {

        println("Animal sound")

    }


    open fun eat() {

        println("Animal eat")

    }


}