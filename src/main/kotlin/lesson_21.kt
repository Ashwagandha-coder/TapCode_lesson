fun main() {

    val list = mutableListOf(10,20,30,40,50)


    try {

        action(-1)

    }
    catch (e: Exception) {

        e.printStackTrace()

    }




}

fun action(tel: Int) {

    if (tel < 0)
        throw MyException("Error validation")
    else
        println(tel)

}

class MyException(val msg: String): Exception(msg) {



}