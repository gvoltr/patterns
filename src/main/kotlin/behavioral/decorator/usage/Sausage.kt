package behavioral.decorator.usage

import behavioral.decorator.pattern.PizzaIngredient

class Sausage (private val ingredient: PizzaIngredient): PizzaIngredient() {

    override fun description(): StringBuilder = ingredient.description().append(", Sausage")

    override fun cost(): Float = ingredient.cost() + 1.2F
}