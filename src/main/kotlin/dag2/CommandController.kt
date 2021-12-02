package dag2

interface CommandController {
    fun takeCommand(command: Command, num: Long)
    fun result(): Long
}