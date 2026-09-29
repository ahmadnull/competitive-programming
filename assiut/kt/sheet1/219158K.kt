fun main() {
    val n = readln().split(" ").map { it.toInt() }
    println("${n.min()} ${n.max()}")
}
