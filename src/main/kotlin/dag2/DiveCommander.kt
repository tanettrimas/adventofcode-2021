package dag2

class DiveCommander : CommandController {
    override fun takeCommand(command: Command, num: Int): Int {
        return 1
    }

    override fun result(): Int {
        return 1;
    }
}