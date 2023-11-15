import kotlin.math.*

class Triangle(val a: Point, val b: Point, val c: Point) {

    // Проверяет, находится ли точка p внутри треугольника.
    // Для этого разобьем треугольник на три других треугольника, с вершиной в точке p.
    fun pointInTriangle(p: Point): Boolean {
        val areaABC = areaTriangle(a, b, c)
        val areaPBC = areaTriangle(p, b, c)
        val areaPCA = areaTriangle(p, c, a)
        val areaPAB = areaTriangle(p, a, b)

        // Если точка p лежит в треугольнике, то
        // сумма площадей треугольников PBC, PCA и PAB будет = площади треугольника ABC
        return abs(areaPBC + areaPCA + areaPAB - areaABC) < 0.0001
    }

    // Рассчитывает площадь треугольника, заданного тремя точками
    private fun areaTriangle(p1: Point, p2: Point, p3: Point): Double {
        val area = 0.5 * ((p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y))
        return abs(area)
    }
}