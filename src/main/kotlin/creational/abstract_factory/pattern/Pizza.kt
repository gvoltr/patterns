package creational.abstract_factory.pattern

class Pizza (
        private val name: String,
        ingredientFactory: PizzaIngredientFactory
) {

    private val dough = ingredientFactory.createDough()
    private val cheese = ingredientFactory.createCheese()
    private val sauce = ingredientFactory.createSauce()
    private val pepperoni = ingredientFactory.createPepperoni()
    private val veggies = ingredientFactory.createVeggies()

    fun prepare() {
        println("__Preparing ${name}__")
        println("Preparing dough $dough")
        println("Adding sauce - $sauce")
        println("Adding pepperoni $pepperoni")
        println("Adding veggies $veggies")
        println("Adding cheese $cheese")

        bake()
        cut()
        box()
    }

    private fun bake() {
        println("Bake for 25 minutes at 350")
    }

    private fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    private fun box() {
        println("Place pizza in official box")
    }

}