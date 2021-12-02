package dag2

fun convertToCommand(command: String): Command? {
    return Command.values().find { it.name == command.uppercase() }
}