package behavioral.decorator.pattern

abstract class PizzaIngredient {

    abstract fun description() : StringBuilder

    abstract fun cost(): Float

}