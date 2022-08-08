fun main() {

    val variable = Car(speed = 56, name = "Buggati Veiron", windows = 4, floors = 2, engine = "Jz")

    variable.go()

    println(variable.power)





}

public class Car (
    private val engine: String,
    private val floors: Int,
    private val windows: Int,
    private val name: String,
    private val speed: Int) {

    var power = 98
        get() {
            return field
        }
        set(value) {
            power = value
        }


    fun go() {

        power = 22

    }

    fun stop() {}



}

// недоделал

