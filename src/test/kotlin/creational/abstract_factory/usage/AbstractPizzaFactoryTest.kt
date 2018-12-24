package creational.abstract_factory.usage

import creational.abstract_factory.pattern.Pizza
import creational.abstract_factory.usage.chicago.ChicagoIngredienFactory
import creational.abstract_factory.usage.ny.NYIngredientFactory
import org.junit.Test

class AbstractPizzaFactoryTest {

    @Test
    fun `Pizzas are created with ingredients provided by concrete factories` () {
        val chicagoPizza = Pizza("Chicago pizza", ChicagoIngredienFactory())
        chicagoPizza.prepare()

        val nyPizza = Pizza("NY Pizza", NYIngredientFactory())
        nyPizza.prepare()
    }

}