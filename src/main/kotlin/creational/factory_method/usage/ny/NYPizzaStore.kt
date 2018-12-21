package creational.factory_method.usage.ny

import creational.factory_method.pattern.Pizza
import creational.factory_method.pattern.PizzaStore
import creational.factory_method.pattern.PizzaType
import creational.factory_method.usage.ny.pizzas.NYStyleCheesePizza
import creational.factory_method.usage.ny.pizzas.NYStyleSweetChickenPizza

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.Cheese -> NYStyleCheesePizza()
            PizzaType.SweetChicken -> NYStyleSweetChickenPizza()
        }
    }
}