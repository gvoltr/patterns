package behavioral.decorator.usage

import behavioral.decorator.pattern.PizzaIngredient
import behavioral.decorator.pattern.Sauce

class Pesta (private val ingredient: PizzaIngredient): Sauce() {

    override fun description(): StringBuilder = ingredient.description().append(", Pesta")

    override fun cost(): Float = ingredient.cost() + 0.6F
}