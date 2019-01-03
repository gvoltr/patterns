package behavioral.strategy

class FlyNoWay : FlyBehaviour {

    override fun fly() {
        println("Can't fly")
    }

}