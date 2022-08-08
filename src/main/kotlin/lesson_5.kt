fun main() {

    var list: Array<Int> = arrayOf(11,12,13,14,15)

    var arrayList: ArrayList<String> = ArrayList()

    val names = arrayOf("Peter","Maria")

    val langs = arrayOf("Kotlin","Java","C++")

    val nulls = arrayListOf<Int>(1,2,3,4,5)

    println(list.size)

    // Java ArrayList

    arrayList.add("gfbhfg")
    arrayList.add("5645")
    arrayList.add("gfbhgnfg")

    println(arrayList.size)

    println("---")

    list.forEach { e -> println(e) }

    list.forEachIndexed { index,e -> println("$index " + e) }

}

class Person(age: Int, hight: Int, sex: String) {


    private val age: Int = 18
    private val hight: Int = 185
    private val sex: String = "Man"
    private var colorHair: String = ""






}

