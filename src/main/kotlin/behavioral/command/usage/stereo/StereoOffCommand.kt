package behavioral.command.usage.stereo

import behavioral.command.pattern.Command

class StereoOffCommand (private val stereo: StereoSystem) : Command {

    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }

}