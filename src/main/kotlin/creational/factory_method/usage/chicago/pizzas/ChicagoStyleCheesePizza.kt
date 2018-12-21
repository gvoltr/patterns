package creational.factory_method.usage.pizzas

import creational.factory_method.pattern.Pizza

class ChicagoStyleCheesePizza : Pizza(
        name = "Chicago Style Deep Dish Cheese Pizza",
        sauce = "Plum Tomato Sauce",
        toppings = listOf("Shredded Mozzarella Cheese", "Blue Cheese")
) {

    override fun cut() {
        println("Cutting the pizza into square slices")
    }

}