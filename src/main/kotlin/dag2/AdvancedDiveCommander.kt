package dag2

class AdvancedDiveCommander(private var aim: Long = 0) : SimpleDiveCommander() {

    override fun takeCommand(command: Command, num: Long) {
        when (command) {
            Command.FORWARD -> {
                horizontal += num
                if (aim > 0) {
                    depth += aim * num
                }
            }
            Command.UP -> {
                aim -= num
            }
            Command.DOWN -> {
                aim += num
            }
        }
    }
}