package behavioral.template_method

abstract class HotBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    protected abstract fun brew()

    protected abstract fun addCondiments()

    private fun boilWater() {
        println("Boil some water")
    }

    protected open fun pourInCup() {
        println("Pour in cup")
    }

}