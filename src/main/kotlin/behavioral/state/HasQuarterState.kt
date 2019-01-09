package behavioral.state

class HasQuarterState (private val gunballMachine: GumballMachine): GumballMachineState {

    override fun ejectQuarter() {
        gunballMachine.state = gunballMachine.noQuarterState
    }

    override fun turnCrank() {
        gunballMachine.state = gunballMachine.soldState
    }

}