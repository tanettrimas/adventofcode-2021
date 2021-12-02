package dag2

open class SimpleDiveCommander(protected var depth: Long = 0, protected var horizontal: Long = 0) : CommandController {
    override fun takeCommand(command: Command, num: Long) {
        when (command) {
            Command.FORWARD -> horizontal += num
            Command.UP -> depth -= num
            Command.DOWN -> depth += num
        }
    }

    override fun result(): Long {
        return depth * horizontal;
    }
}