import kotlin.math.log10

fun main() {
    val (a, b, c, d) = readln().split(" ").map { it.toDouble() }
    if (b * log10(a) > d * log10(c)) println("YES")
    else println("NO")
}
