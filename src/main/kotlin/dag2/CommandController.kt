package dag2

interface CommandController {
    fun takeCommand(command: Command, num: Int)
    fun result(): Int
}