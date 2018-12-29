package behavioral.command.usage.light

class Light (private val place: String){

    fun on() {
        println("Light on in $place")
    }

    fun off() {
        println("Light off in $place")
    }

}