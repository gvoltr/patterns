package behavioral.decorator.usage

import behavioral.decorator.pattern.PizzaIngredient

class Mushroom (private val ingredient: PizzaIngredient): PizzaIngredient() {
    override fun description(): StringBuilder = ingredient.description().append(", Mushroom")

    override fun cost(): Float = ingredient.cost() + 0.6F
}