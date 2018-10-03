package behavioral.decorator.usage

import behavioral.decorator.pattern.Dough

class ItalianDough : Dough() {
    override fun description(): StringBuilder = StringBuilder("Italian dough")

    override fun cost(): Float = 1.0F
}