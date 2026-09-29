fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println(if (a % b == 0 || b % a == 0) "Multiples" else "No Multiples")
}
