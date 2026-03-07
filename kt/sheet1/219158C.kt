fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    println("$x + $y = ${x + y}\n$x * $y = ${x.toLong() * y}\n$x - $y = ${x - y}")
}
