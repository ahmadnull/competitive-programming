fun main() {
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    println("Difference = ${a.toLong() * b - c.toLong() * d}")
}
