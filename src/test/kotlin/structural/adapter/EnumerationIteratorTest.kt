package structural.adapter

import org.junit.Assert
import org.junit.Test
import java.util.*

class EnumerationIteratorTest {

    @Test
    fun `enumeration called`() {
        val chars = arrayOf('a', 'b', 'c')

        val vectorOfChars = Vector<Char>()
        chars.forEach { vectorOfChars.add(it) }

        val adapter = EnumerationIterator<Char> (vectorOfChars.elements())

        var index = 0
        adapter.forEach {
            Assert.assertEquals(it, chars[index])
            index++
        }
    }

}