package creational.factory_method.pattern

abstract class Pizza(
        val name: String,
        val sauce: String,
        val toppings: List<String>
) {

    open fun prepare() {
        println("__Preparing ${name}__")
        println("Adding sauce - $sauce")
        println("Adding toppings: ${toppings.joinToString(", ")}")
    }

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official box")
    }

}