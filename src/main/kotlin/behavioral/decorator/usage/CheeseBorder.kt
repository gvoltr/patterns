package behavioral.decorator.usage

import behavioral.decorator.pattern.Dough

class CheeseBorder : Dough() {
    override fun description(): StringBuilder = StringBuilder("Cheese Border")

    override fun cost(): Float = 2.5F
}