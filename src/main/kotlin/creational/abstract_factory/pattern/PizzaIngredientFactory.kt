package creational.abstract_factory.pattern

interface PizzaIngredientFactory {

    fun createSauce() : String

    fun createDough() : String

    fun createCheese() : String

    fun createVeggies() : String

    fun createPepperoni() : String

}