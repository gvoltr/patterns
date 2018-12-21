package creational.factory_method.usage.ny.pizzas

import creational.factory_method.pattern.Pizza

class NYStyleCheesePizza : Pizza(
        name = "NY Style Sauce and Cheese Pizza",
        sauce = "Marinara Sauce",
        toppings = listOf("Grated Reggiano Cheese")
)