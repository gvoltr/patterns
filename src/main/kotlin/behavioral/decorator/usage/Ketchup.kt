package behavioral.decorator.usage

import behavioral.decorator.pattern.PizzaIngredient
import behavioral.decorator.pattern.Sauce

class Ketchup(private val ingredient: PizzaIngredient) : Sauce() {
    override fun description(): StringBuilder = ingredient.description().append(", Ketchup")

    override fun cost(): Float = ingredient.cost() + 0.4F
}