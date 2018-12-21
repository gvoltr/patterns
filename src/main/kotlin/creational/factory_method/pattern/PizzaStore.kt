package creational.factory_method.pattern

abstract class PizzaStore {

    fun cookPizza(type: PizzaType) : Pizza {
        val pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(type: PizzaType): Pizza

}