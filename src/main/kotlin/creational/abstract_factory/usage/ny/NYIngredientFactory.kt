package creational.abstract_factory.usage.ny

import creational.abstract_factory.pattern.PizzaIngredientFactory

class NYIngredientFactory : PizzaIngredientFactory {

    override fun createSauce() = "NY sauce"

    override fun createDough() = "NY dough"

    override fun createCheese() = "NY cheese"

    override fun createVeggies() = "NY veggies"

    override fun createPepperoni() = "NY peperoni"

}