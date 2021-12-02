package dag2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class DiveCommanderTest {

    @Test
    fun takeCommandSimple() {
        val diveCommander: CommandController = SimpleDiveCommander()
        diveCommander.takeCommand(Command.FORWARD, 5)
        diveCommander.takeCommand(Command.DOWN, 5)
        diveCommander.takeCommand(Command.FORWARD, 8)
        diveCommander.takeCommand(Command.UP, 3)
        diveCommander.takeCommand(Command.DOWN, 8)
        diveCommander.takeCommand(Command.FORWARD, 2)

        assertEquals(150, diveCommander.result())
    }

    @Test
    fun takeCommandSimpleWithFile() {
        val diveCommander = SimpleDiveCommander()
        val file = File(javaClass.classLoader.getResource("day2-1.txt").file)
        file.bufferedReader().useLines { lines ->
            lines.forEach {
                val splitted = it.split(" ")
                val command = convertToCommand(splitted[0])
                val num = splitted[1].toLong()
                if (command == null) {
                    throw RuntimeException()
                }
                diveCommander.takeCommand(command, num)
            }
            assertEquals(1580000, diveCommander.result())
        }
    }

    @Test
    fun takeCommandAdvanced() {
        val diveCommander: CommandController = AdvancedDiveCommander()
        diveCommander.takeCommand(Command.FORWARD, 5)
        diveCommander.takeCommand(Command.DOWN, 5)
        diveCommander.takeCommand(Command.FORWARD, 8)
        diveCommander.takeCommand(Command.UP, 3)
        diveCommander.takeCommand(Command.DOWN, 8)
        diveCommander.takeCommand(Command.FORWARD, 2)

        assertEquals(900, diveCommander.result())

    }

    @Test
    fun takeCommandAdvancedWithFile() {
        val file = File(javaClass.classLoader.getResource("day2-1.txt").file)
        val diveCommander = AdvancedDiveCommander()
        file.bufferedReader().useLines { lines ->
            lines.forEach {
                val splitted = it.split(" ")
                val command = convertToCommand(splitted[0])
                val num = splitted[1].toLong()
                if (command == null) {
                    throw RuntimeException()
                }
                diveCommander.takeCommand(command, num)
            }
        }
        assertEquals(1251263225, diveCommander.result())
    }
}