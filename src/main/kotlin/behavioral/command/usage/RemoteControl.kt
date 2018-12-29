package behavioral.command.usage

import behavioral.command.pattern.Command
import behavioral.command.pattern.NoCommand
import java.util.*

class RemoteControl(numberOfControls: Int) {

    private val onCommands = Array<Command>(numberOfControls) { NoCommand() }
    private val offCommands = Array<Command>(numberOfControls) { NoCommand() }

    private val commandsHistory = Stack<Command>()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonPushed(slot: Int) {
        val commandToExecute = onCommands[slot]
        commandToExecute.execute()
        commandsHistory.add(commandToExecute)
    }

    fun offButtonPushed(slot: Int) {
        val commandToExecute = offCommands[slot]
        commandToExecute.execute()
        commandsHistory.add(commandToExecute)
    }

    fun undo() {
        if (!commandsHistory.empty()) {
            commandsHistory.pop().undo()
        }
    }

}