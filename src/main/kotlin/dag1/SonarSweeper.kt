package dag1

class SonarSweeper {
    fun getDepthMeasurement(measurements: List<Int>): Int {
        var depth = 0
        var previousMeasure = 0;
        measurements.forEachIndexed() {
            index, i ->
            run {
                if (index != 0 && i > previousMeasure) {
                    depth++;
                }
                previousMeasure = i;
            }
        }
        return depth;
    }

    fun getDepthMeasurementWindowed(measurements: List<Int>): Int {
        val windowed = measurements.windowed(3) { it.sum() }
        return getDepthMeasurement(windowed)
    }
}