package creational.factory_method.usage.ny.pizzas

import creational.factory_method.pattern.Pizza

class NYStyleSweetChickenPizza : Pizza(
        name = "NY Style Sweet Chicken",
        sauce = "White sauce",
        toppings = listOf("Pepper", "Pineapples")
)