fun main() {

    println("Names via delimetr _")

    val names = readLine().orEmpty()

    println("Salarys via delimetr _ ")

    val salarys = readLine().orEmpty()

    val namesArray: List<String> = names.split(",")
    val salaryArray: List<String> = salarys.split(",")

    validationNames(namesArray,10)
    validationSalarys(salaryArray,6)

    printTable(namesArray,salaryArray)





}

fun validationNames(names: List<String>, maxSize: Int) {

    names.forEach{ e ->

        if (e.length > maxSize) {

            println("Invalid count symbol names")

        }

    }

}


fun validationSalarys(salarys: List<String>, maxSize: Int) {

    salarys.forEach { e ->

        if (e.length > maxSize) {

            println("Invalid count symbols salarys")

        }

    }

}

fun printTable(names: List<String>, salarys: List<String>) {

    println("-".repeat(23))

    for (name in names) {

        val indexName = names.indexOf(name)
        val salary = salarys[indexName]
        val f1 = (12 - name.length) / 2
        val f2 = (12 - name.length) - f1
        val s1 = (8 - salary.length) / 2
        val s2 = (8 - salary.length) - s1

        println("|" + " ".repeat(f1) + name + " ".repeat(f2) + "|" + " ".repeat(s1) + salary + " ".repeat(s2) + "|")

    }

    println("-".repeat(23))


}