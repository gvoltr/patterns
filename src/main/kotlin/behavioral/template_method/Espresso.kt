package behavioral.template_method

class Espresso : HotBeverage() {

    override fun brew() {
        println("Dripping coffee through the filter")
    }

    override fun addCondiments() {}

    override fun pourInCup() {
        println("Pour into espresso cup")
    }
}