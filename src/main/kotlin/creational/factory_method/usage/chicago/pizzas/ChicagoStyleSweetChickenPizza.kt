package creational.factory_method.usage.chicago.pizzas

import creational.factory_method.pattern.Pizza

class ChicagoStyleSweetChickenPizza : Pizza(
        name = "Chicago Sweet Chicken",
        sauce = "Sweet Chili",
        toppings = listOf("Pineapples")
)