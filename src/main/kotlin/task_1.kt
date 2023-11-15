fun main() {
    println("Введите координаты вершин треугольника: ")
    val coord_triangle = readLine().toString().split(" ").map { it.toDouble() }
    val triangle = Triangle(
        Point(coord_triangle[0], coord_triangle[1]),
        Point(coord_triangle[2], coord_triangle[3]),
        Point(coord_triangle[4], coord_triangle[5])
    )

    print("Введите координаты точки: ")
    val coord_point = readLine().toString().split(" ").map { it.toDouble() }
    if (triangle.pointInTriangle(Point(coord_point[0], coord_point[1]))) {
        println("Точка находится внутри треугольника.")
    } else {
        println("Точка находится вне треугольника.")
    }
}