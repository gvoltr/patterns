package behavioral.command.usage.light

import behavioral.command.pattern.Command

class LightOffCommand (private val light: Light) : Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }

}