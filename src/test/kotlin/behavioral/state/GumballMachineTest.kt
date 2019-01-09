package behavioral.state

import org.junit.Assert.assertTrue
import org.junit.Test

class GumballMachineTest {

    @Test
    fun `empty gumball machine can't change state`() {
        val gumballMachine = GumballMachine(0)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        assertTrue(gumballMachine.soldOutState == gumballMachine.state)
    }

    @Test
    fun `inserting a quarter changes state` () {
        val gumballMachine = GumballMachine(1)

        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)

        gumballMachine.insertQuarter()

        assertTrue(gumballMachine.hasQuarterState == gumballMachine.state)
    }

    @Test
    fun `turning crank resetting state if there are gumballs left` () {
        val gumballMachine = GumballMachine(2)

        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)
    }

    @Test
    fun `turning crank transform state into sold out if there are no gumballs left` () {
        val gumballMachine = GumballMachine(1)

        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        assertTrue(gumballMachine.soldOutState == gumballMachine.state)
    }

    @Test
    fun `eject quarter transforms state into no quarter state if crank not turned yet` () {
        val gumballMachine = GumballMachine(2)

        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)
        gumballMachine.insertQuarter()
        assertTrue(gumballMachine.hasQuarterState == gumballMachine.state)
        gumballMachine.ejectQuarter()
        assertTrue(gumballMachine.noQuarterState == gumballMachine.state)
    }
}