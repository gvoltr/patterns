package behavioral.state

class GumballMachine (private var numberOfGumballs: Int) {

    private val gumballsHolder = GumballsHolder(numberOfGumballs)

    val soldOutState = SoldOutState()
    val hasQuarterState = HasQuarterState(this)
    val noQuarterState = NoQuarterState(this)
    val soldState = SoldState(this, gumballsHolder)

    var state: GumballMachineState = soldOutState

    init {
        if (gumballsHolder.numberOfGumballs() > 0) {
            state = noQuarterState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

   fun refill(gumballsAmount: Int) {
       if (gumballsAmount > 0) {
           gumballsHolder.refill(gumballsAmount)
           state = noQuarterState
       }
   }

}