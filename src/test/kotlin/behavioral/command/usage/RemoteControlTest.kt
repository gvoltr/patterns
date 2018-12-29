package behavioral.command.usage

import behavioral.command.usage.garage_door.GarageDoor
import behavioral.command.usage.garage_door.GarageDoorCloseCommand
import behavioral.command.usage.garage_door.GarageDoorOpenCommand
import behavioral.command.usage.light.Light
import behavioral.command.usage.light.LightOffCommand
import behavioral.command.usage.light.LightOnCommand
import behavioral.command.usage.stereo.RadioOnCommand
import behavioral.command.usage.stereo.StereoOffCommand
import behavioral.command.usage.stereo.StereoSystem
import org.junit.Test
import org.mockito.Mockito.*

class RemoteControlTest {

    @Test
    fun `remote control can be set up with commands and commands can be executed`() {
        println("__Testing remote control__")

        val kitchenLight = Light("Kitchen")
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)

        val bathLight = Light("Bathroom")
        val bathLightOn = LightOnCommand(bathLight)
        val bathLightOff = LightOffCommand(bathLight)

        val garageDoor = GarageDoor()
        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
        val garageDoorClose = GarageDoorCloseCommand(garageDoor)

        val stereo = StereoSystem()
        val radioOn = RadioOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        val remoteControl = RemoteControl(4)
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff)
        remoteControl.setCommand(1, bathLightOn, bathLightOff)
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose)
        remoteControl.setCommand(3, radioOn, stereoOff)

        remoteControl.onButtonPushed(0)
        remoteControl.offButtonPushed(0)
        remoteControl.onButtonPushed(1)
        remoteControl.offButtonPushed(1)
        remoteControl.onButtonPushed(2)
        remoteControl.offButtonPushed(2)
        remoteControl.onButtonPushed(3)
        remoteControl.offButtonPushed(3)

        println("____")
    }

    @Test
    fun `remote control calls right command`() {
        val remoteControl = RemoteControl(2)

        val lightOnMock = mock(LightOnCommand::class.java)
        val lightOffMock = mock(LightOffCommand::class.java)

        remoteControl.setCommand(0, lightOnMock, lightOffMock)

        remoteControl.onButtonPushed(0)
        remoteControl.onButtonPushed(1)

        verify(lightOnMock, times(1)).execute()

        remoteControl.offButtonPushed(0)
        remoteControl.offButtonPushed(1)

        verify(lightOffMock, times(1)).execute()
    }

    @Test
    fun `undo functionality works`() {
        val remoteControl = RemoteControl(1)

        val lightOnMock = mock(LightOnCommand::class.java)
        val lightOffMock = mock(LightOffCommand::class.java)

        remoteControl.setCommand(0, lightOnMock, lightOffMock)

        remoteControl.onButtonPushed(0)

        verify(lightOnMock, times(1)).execute()

        remoteControl.undo()

        verify(lightOnMock, times(1)).undo()
    }

    @Test
    fun `macro command can be executed via remote control`() {
        val lightOnMock = mock(LightOnCommand::class.java)
        val lightOffMock = mock(LightOffCommand::class.java)

        val radioOnMock = mock(RadioOnCommand::class.java)
        val stereoOffMock = mock(StereoOffCommand::class.java)

        val lightAndStereoOn = MacroCommand(arrayOf(lightOnMock, radioOnMock))
        val lightAndStereoOff = MacroCommand(arrayOf(lightOffMock, stereoOffMock))

        val remoteControl = RemoteControl(1)
        remoteControl.setCommand(0, lightAndStereoOn, lightAndStereoOff)

        remoteControl.onButtonPushed(0)

        verify(lightOnMock, times(1)).execute()
        verify(lightOnMock, times(0)).undo()
        verify(radioOnMock, times(1)).execute()
        verify(radioOnMock, times(0)).undo()

        remoteControl.undo()

        verify(lightOnMock, times(1)).undo()
        verify(radioOnMock, times(1)).undo()

        remoteControl.offButtonPushed(0)

        verify(lightOffMock, times(1)).execute()
        verify(lightOffMock, times(0)).undo()
        verify(stereoOffMock, times(1)).execute()
        verify(stereoOffMock, times(0)).undo()

        remoteControl.undo()
        verify(lightOffMock, times(1)).undo()
        verify(stereoOffMock, times(1)).undo()
    }

}