package behavioral.command.usage.garage_door

import behavioral.command.pattern.Command

class GarageDoorOpenCommand (private val garageDoor: GarageDoor) : Command {

    override fun execute() {
        garageDoor.up()
        garageDoor.stop()
        garageDoor.lightOn()
    }

    override fun undo() {
        garageDoor.down()
        garageDoor.stop()
        garageDoor.lightOff()
    }

}