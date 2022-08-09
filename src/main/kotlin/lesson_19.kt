fun main() {

    val other: Other = Other("Ivan","Ivanov",23423)



}

class Other(private val name: String, private val surName: String, private val passport: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Other

        if (name != other.name) return false
        if (surName != other.surName) return false
        if (passport != other.passport) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surName.hashCode()
        result = 31 * result + passport
        return result
    }


}