import kotlin.math.max
import kotlin.math.min

fun main() {
    val (l1, r1, l2, r2) = readln().split(" ").map { it.toInt() }
    val lMax = max(l1, l2)
    val rMin = min(r1, r2)
    if (lMax <= rMin) println("$lMax $rMin")
    else println(-1)
}
