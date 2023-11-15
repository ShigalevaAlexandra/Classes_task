import kotlin.math.*

class Point(val x: Double, val y: Double) {
    // Рассточние между двумя точками
    fun distancePoint(two: Point): Double {
        val x1_x2 = x - two.x
        val y1_y2 = y - two.y
        return sqrt(x1_x2 * x1_x2 + y1_y2 * y1_y2)
    }
}