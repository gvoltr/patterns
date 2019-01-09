package behavioral.state

class GumballsHolder (private var numberOfGumballs: Int) {

    fun refill(refillAmount: Int) {
        numberOfGumballs += refillAmount
    }

    fun releaseBall() {
        println("Releasing a gumball")
        numberOfGumballs--
    }

    fun numberOfGumballs() = numberOfGumballs

}