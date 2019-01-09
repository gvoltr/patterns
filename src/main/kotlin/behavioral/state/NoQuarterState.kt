package behavioral.state

class NoQuarterState (private val gumballMachine: GumballMachine): GumballMachineState {

    override fun insertQuarter() {
        gumballMachine.state = gumballMachine.hasQuarterState
    }

}