package creational.factory_method.usage.chicago

import creational.factory_method.pattern.Pizza
import creational.factory_method.pattern.PizzaStore
import creational.factory_method.pattern.PizzaType
import creational.factory_method.usage.chicago.pizzas.ChicagoStyleSweetChickenPizza
import creational.factory_method.usage.pizzas.ChicagoStyleCheesePizza

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.Cheese -> ChicagoStyleCheesePizza()
            PizzaType.SweetChicken -> ChicagoStyleSweetChickenPizza()
        }
    }

}