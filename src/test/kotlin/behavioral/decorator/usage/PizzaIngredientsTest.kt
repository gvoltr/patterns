package behavioral.decorator.usage

import org.junit.Assert.assertEquals
import org.junit.Test

class PizzaIngredientsTest {

    @Test
    fun `description of pizza is correct`() {
        val pizza = Pepper(Sausage(Ketchup(CheeseBorder())))
        assertEquals("Cheese Border, Ketchup, Sausage, Pepper", pizza.description().toString())
    }

    @Test
    fun `price of pizza is correct`() {
        val pizza = Mushroom(Pepper(Sausage(Pesta(ItalianDough()))))
        assertEquals(3.9F, pizza.cost())
    }
}