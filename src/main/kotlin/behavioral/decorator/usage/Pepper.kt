package behavioral.decorator.usage

import behavioral.decorator.pattern.PizzaIngredient

class Pepper (private val ingredient: PizzaIngredient): PizzaIngredient() {
    override fun description(): StringBuilder = ingredient.description().append(", Pepper")

    override fun cost(): Float = ingredient.cost() + 0.5F
}