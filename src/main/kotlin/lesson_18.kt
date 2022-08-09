fun main() {

    val any: Any = Any()

    val user = User("John","Doe",22)

    println(user.javaClass)


}

class User(private val firstName: String, private val lastName: String, private val age: Int) {



}