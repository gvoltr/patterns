package behavioral.command.usage.stereo

import behavioral.command.pattern.Command

class RadioOnCommand(private val stereo: StereoSystem) : Command {

    override fun execute() {
        stereo.on()
        stereo.setRadio()
        stereo.setVolume(10)
    }

    override fun undo() {
        stereo.off()
    }

}