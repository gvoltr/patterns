package structural.facade

import org.junit.Test
import org.mockito.Mockito.*

class HomeTheaterFacadeTest {

    val dvdPlayer = mock(DvdPlayer::class.java)
    val projector = mock(Projector::class.java)
    val screen = mock(Screen::class.java)
    val light = mock(TheaterLight::class.java)

    @Test
    fun `Turning home theater on turn on all components`() {
        val facade = HomeTheaterFacade(dvdPlayer, projector, screen, light)

        val movieName = "Inception"
        facade.playMovie(movieName)

        val order = inOrder(dvdPlayer, light, projector, screen)

        order.verify(screen, times(1)).down()
        order.verify(projector, times(1)).on()
        order.verify(light, times(1)).off()
        order.verify(dvdPlayer, times(1)).play(movieName)

        order.verifyNoMoreInteractions()
    }

    @Test
    fun `Turning home theater off turn off all components`() {
        val facade = HomeTheaterFacade(dvdPlayer, projector, screen, light)

        facade.turnOff()

        val order = inOrder(dvdPlayer, light, projector, screen)

        order.verify(light, times(1)).on()
        order.verify(dvdPlayer, times(1)).stop()
        order.verify(projector, times(1)).off()
        order.verify(screen, times(1)).up()

        order.verifyNoMoreInteractions()
    }

}