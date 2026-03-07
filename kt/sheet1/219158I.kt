fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println(if (a >= b) "Yes" else "No")
}
