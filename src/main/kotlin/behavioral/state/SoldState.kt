package behavioral.state

class SoldState(
        private val gumballMachine: GumballMachine,
        private val gumballsHolder: GumballsHolder
) : GumballMachineState {

    override fun dispense() {
        gumballsHolder.releaseBall()
        gumballMachine.state = if (gumballsHolder.numberOfGumballs() > 0) {
            gumballMachine.noQuarterState
        } else {
            gumballMachine.soldOutState
        }
    }

}