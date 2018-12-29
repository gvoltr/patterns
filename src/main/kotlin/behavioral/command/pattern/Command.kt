package behavioral.command.pattern

interface Command {

    fun execute()

    fun undo()

}