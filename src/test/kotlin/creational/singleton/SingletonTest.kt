package creational.singleton

import org.junit.Assert.assertTrue
import org.junit.Test

class SingletonTest {

    @Test
    fun `Both singleton values are same`() {
        val singletonA = Singleton
        val singletonB = Singleton

        assertTrue(singletonA == singletonB)
        assertTrue(singletonA === singletonB)
    }
}