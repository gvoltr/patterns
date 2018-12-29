package behavioral.command.usage.garage_door

import behavioral.command.pattern.Command

class GarageDoorCloseCommand (private val garageDoor: GarageDoor) : Command {

    override fun execute() {
        garageDoor.down()
        garageDoor.stop()
        garageDoor.lightOff()
    }

    override fun undo() {
        garageDoor.up()
        garageDoor.stop()
        garageDoor.lightOn()
    }

}