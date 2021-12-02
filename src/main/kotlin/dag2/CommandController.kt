package dag2

interface CommandController {
    fun takeCommand(command: Command, num: Int): Int
    fun result(): Int
}