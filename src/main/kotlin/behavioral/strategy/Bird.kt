package behavioral.strategy

open class Bird (private val flyBehaviour: FlyBehaviour) {

    fun fly() {
        flyBehaviour.fly()
    }

}