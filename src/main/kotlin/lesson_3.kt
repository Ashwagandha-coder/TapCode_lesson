import java.io.PrintStream
import java.nio.charset.StandardCharsets

fun main() {

    var age: Int

    age = 20

    // if else

    if(age >= 18) {
        println("Добро пожалолвать")
    }
    else {
        println("В доступе отказано")
    }

    val dayOfWeek: String

    dayOfWeek = "Monday"

    // when


    when(dayOfWeek) {

        "Monday" -> println("Monday")
        "Tuesday" -> println("Tuesday")
        "Sunday" -> println("Sunday")
        "Saturday" -> println("Saturday")
    }

    val russia: PrintStream = PrintStream(System.out,true,StandardCharsets.UTF_8)

    russia.println("Россия")


}
