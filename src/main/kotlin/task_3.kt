fun main() {
    print("Введите количество точек: ")
    val count_points = readln().toInt()
    val points = mutableListOf<Point>()
    for (i in 1..count_points) {
        print("Введите координаты точки $i: ")
        val coords = readLine().toString().split(" ").map { it.toDouble() }
        points.add(Point(coords[0], coords[1]))
    }

    var minDistance = Double.MAX_VALUE
    var maxDistance = Double.MIN_VALUE
    for (i in points.indices) {
        for (j in i + 1 until points.size) {
            val distance = points[i].distancePoint(points[j])
            if (distance < minDistance) minDistance = distance
            if (distance > maxDistance) maxDistance = distance
        }
    }
    println("Минимальное расстояние между точками: $minDistance")
    println("Максимальное расстояние между точками: $maxDistance")
}