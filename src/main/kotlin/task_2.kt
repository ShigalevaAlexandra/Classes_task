fun main() {
    print("Введите координаты первой точки: ")
    val coord_first_point = readLine().toString().split(" ").map { it.toDouble() }
    print("Введите координаты второй точки: ")
    val coord_second_point = readLine().toString().split(" ").map { it.toDouble() }
    val point_first = Point(coord_first_point[0], coord_first_point[1])
    println("Расстояние между точками: ${point_first.distancePoint(Point(coord_second_point[0], coord_second_point[1]))}")
}