package dag2

open class SimpleDiveCommander(protected var depth: Int = 0, protected var horizontal: Int = 0) : CommandController {
    override fun takeCommand(command: Command, num: Int) {
        when (command) {
            Command.FORWARD -> horizontal += num
            Command.UP -> depth -= num
            Command.DOWN -> depth += num
        }
    }

    override fun result(): Int {
        return depth * horizontal;
    }
}