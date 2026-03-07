import kotlin.math.floor
import kotlin.math.ceil
import kotlin.math.roundToInt

fun main() {
    val (a, b) = readln().split(" ").map { it.toDouble() }
    println(String.format("floor %.0f / %.0f = %.0f\nceil %.0f / %.0f = %.0f\nround %.0f / %.0f = %d", a, b, floor(a / b), a, b, ceil(a /b), a, b, (a / b).roundToInt()))
}
