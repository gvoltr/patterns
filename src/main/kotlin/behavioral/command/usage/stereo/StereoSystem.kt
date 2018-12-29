package behavioral.command.usage.stereo

class StereoSystem {

    fun on() {
        println("Stereo on")
    }

    fun off() {
        println("Stereo off")
    }

    fun setCD() {
        println("Playing CD")
    }

    fun setRadio() {
        println("Playing radio")
    }

    fun setVolume(volume: Int) {
        println("Setting volume to $volume")
    }

}