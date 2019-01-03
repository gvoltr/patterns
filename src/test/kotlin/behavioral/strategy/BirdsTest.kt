package behavioral.strategy

import org.junit.Test

class BirdsTest {

    @Test
    fun `showcase some birds can fly and some don't`() {
        val eagle = Eagle()
        val ostrich = Ostrich()

        println("Eagle can fly")
        eagle.fly()

        println("Ostrich can't")
        ostrich.fly()
    }

}