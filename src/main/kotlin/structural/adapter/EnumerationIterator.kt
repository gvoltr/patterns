package structural.adapter

import java.util.*

class EnumerationIterator<I>(private val enumeration: Enumeration<I>) : Iterator<I> {

    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): I {
        return enumeration.nextElement()
    }

}