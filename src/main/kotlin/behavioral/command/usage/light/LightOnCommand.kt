package behavioral.command.usage.light

import behavioral.command.pattern.Command

class LightOnCommand (private val light: Light): Command {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }

}