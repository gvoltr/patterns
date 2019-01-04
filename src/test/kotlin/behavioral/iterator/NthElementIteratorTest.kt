package behavioral.iterator

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class NthElementIteratorTest {

    @Test
    fun `can't iterate through empty array`() {
        val iterator = NthElementIterator<Int>(emptyArray())
        assertFalse(iterator.hasNext())
    }

    @Test
    fun `can iterate through every second element`() {
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
        val iterator = NthElementIterator(array, 2)

        val expectingArray = arrayOf(0, 2, 4, 6, 8)

        val iteratorResultCollection = ArrayList<Int>()
        iterator.forEach { iteratorResultCollection.add(it) }

        assertArrayEquals(expectingArray, iteratorResultCollection.toArray())
    }

    @Test
    fun `can iterate through every third element`() {
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val iterator = NthElementIterator(array, 3)

        val expectingArray = arrayOf(0, 3, 6, 9)

        val iteratorResultCollection = ArrayList<Int>()
        iterator.forEach { iteratorResultCollection.add(it) }

        assertArrayEquals(expectingArray, iteratorResultCollection.toArray())
    }
    
}