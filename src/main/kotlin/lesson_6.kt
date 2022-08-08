import kotlin.concurrent.thread

fun main() {

    val string = "Hello World"

    println(string[string.length - 1])


    val cardNumber = "1234 5678 9101 1121"

    println(cardNumber.startsWith("1234"))
    println(cardNumber.endsWith("1"))

    val name45 = "Hello"

    println("The lenght of \n ${name45.length}")

    val name = "dan"

    println(name.capitalize())

    val nameing = "   urka"

    println(nameing.isEmpty())

    val newName = nameing.trim()

    println(newName)

    val stroka = "Today"

    var other = stroka.toLowerCase().replace("today","*")

    println(other)

    other = "p,e,q,w,t"

    println(other.split(","))

    val input = readln()
    println(input)

}



class lesson_6 {
}