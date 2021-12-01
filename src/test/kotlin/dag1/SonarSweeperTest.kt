package dag1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

internal class SonarSweeperTest {

    @Test
    internal fun getDepthMeasurementHappyPath() {
        val measurements = listOf(
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263
        )
        assertEquals(7, SonarSweeper().getDepthMeasurement(measurements))
    }

    @Test
    internal fun getDepthMeasurementFromTestfile() {
        val depthMeasurement = SonarSweeper().getDepthMeasurement(getMeasurementsFromFile())
        assertEquals(1713, depthMeasurement)
    }

    private fun getMeasurementsFromFile(): List<Int> {
        val file = File(javaClass.classLoader.getResource("day1-1.txt").file)
        val measurements = file.bufferedReader().useLines { it.toList() }.map { it.toInt() }
        return measurements
    }

    @Test
    internal fun getDepthMeasurementWindowedHappyPath() {
        val measurements = listOf(
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263
        )
        val actual = SonarSweeper().getDepthMeasurementWindowed(measurements)
        assertEquals(5, actual)
    }

    @Test
    internal fun getDepthMeasurementWindowedFromTestFile() {
        val depthMeasurement = SonarSweeper().getDepthMeasurementWindowed(getMeasurementsFromFile())
        assertEquals(1734, depthMeasurement)
    }
}