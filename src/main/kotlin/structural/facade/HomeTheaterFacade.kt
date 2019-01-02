package structural.facade

class HomeTheaterFacade(private val player: DvdPlayer,
                        private val projector: Projector,
                        private val screen: Screen,
                        private val theaterLight: TheaterLight) {

    fun playMovie(movieName: String) {
        screen.down()
        projector.on()
        theaterLight.off()
        player.play(movieName)
    }

    fun turnOff() {
        theaterLight.on()
        player.stop()
        projector.off()
        screen.up()
    }

}