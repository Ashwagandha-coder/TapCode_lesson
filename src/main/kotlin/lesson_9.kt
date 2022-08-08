fun main() {

    var param1: Double? = readln()?.toDoubleOrNull()
    var param2: String? = readLine()
    var param3: Double? = readln()?.toDoubleOrNull()


    var result: Double? = 0.0

    if (param1 == null || param2 == null || param3 == null) {

        print("Invalid data")
    }
    else {

        when(param2) {

            "+" -> result = sumNumbers(param1,param3)
            "-" -> result = difference(param1,param3)
            "*" -> result = multyply(param1,param3)
            "/" -> result =  delimetr(param1,param3)



        }


    }

    println(result?.toInt())





}

fun sumNumbers(a: Double?, b: Double): Double = a?.plus(b)!!

fun multyply(a: Double, b: Double): Double = a * b

fun delimetr(a: Double, b: Double): Double = a / b

fun difference(a: Double, b: Double): Double = a - b



