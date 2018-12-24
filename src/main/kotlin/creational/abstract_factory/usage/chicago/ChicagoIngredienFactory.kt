package creational.abstract_factory.usage.chicago

import creational.abstract_factory.pattern.PizzaIngredientFactory

class ChicagoIngredienFactory : PizzaIngredientFactory {

    override fun createSauce() = "chicago sauce"

    override fun createDough() = "chicago dough"

    override fun createCheese() = "chicago cheese"

    override fun createVeggies() = "chicago veggies"

    override fun createPepperoni() = "chicago peperoni"

}