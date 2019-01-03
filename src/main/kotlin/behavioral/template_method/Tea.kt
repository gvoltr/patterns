package behavioral.template_method

class Tea : HotBeverage() {

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding lemon and sugar")
    }

}