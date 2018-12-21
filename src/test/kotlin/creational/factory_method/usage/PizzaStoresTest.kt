package creational.factory_method.usage

import creational.factory_method.pattern.PizzaType
import creational.factory_method.usage.chicago.ChicagoPizzaStore
import creational.factory_method.usage.chicago.pizzas.ChicagoStyleSweetChickenPizza
import creational.factory_method.usage.ny.NYPizzaStore
import creational.factory_method.usage.ny.pizzas.NYStyleCheesePizza
import creational.factory_method.usage.ny.pizzas.NYStyleSweetChickenPizza
import creational.factory_method.usage.pizzas.ChicagoStyleCheesePizza
import org.junit.Assert.assertTrue
import org.junit.Test

class PizzaStoresTest {

    @Test
    fun `NY pizza store should provide NY types of pizza`() {
        val pizzaStore = NYPizzaStore()

        val cheesePizza = pizzaStore.cookPizza(PizzaType.Cheese)
        val sweetChickenPizza = pizzaStore.cookPizza(PizzaType.SweetChicken)

        assertTrue(cheesePizza is NYStyleCheesePizza)
        assertTrue(sweetChickenPizza is NYStyleSweetChickenPizza)
    }

    @Test
    fun `Chicago pizza store should provide Chicago types of pizza`() {
        val pizzaStore = ChicagoPizzaStore()

        val cheesePizza = pizzaStore.cookPizza(PizzaType.Cheese)
        val sweetChickenPizza = pizzaStore.cookPizza(PizzaType.SweetChicken)

        assertTrue(cheesePizza is ChicagoStyleCheesePizza)
        assertTrue(sweetChickenPizza is ChicagoStyleSweetChickenPizza)
    }
}