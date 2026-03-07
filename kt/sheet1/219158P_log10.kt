import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val x = readln().toInt()
    println(if (x / (10.0).pow(log10(x.toDouble()).toInt()).toInt() % 2 == 0) "EVEN" else "ODD")
}
