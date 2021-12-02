package dag2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DiveCommanderTest {

    @Test
    fun takeCommand() {
        val diveCommander: CommandController = DiveCommander()
        diveCommander.takeCommand(Command.FORWARD, 5)
        diveCommander.takeCommand(Command.DOWN, 5)
        diveCommander.takeCommand(Command.FORWARD, 8)
        diveCommander.takeCommand(Command.UP, 3)
        diveCommander.takeCommand(Command.DOWN, 8)
        diveCommander.takeCommand(Command.FORWARD, 2)

        assertEquals(diveCommander.result(), 150)
    }
}