fun main() {
    val (x, y) = readln().split(" ").map { it.toDouble() }
    val result = if (x == 0.0 && y == 0.0) {
        "Origem"
    } else {
        if (x == 0.0) "Eixo Y"
        else if (y == 0.0) "Eixo X"
        else "Q${quadrant(x, y)}"
    }

    println(result)
}

fun quadrant(x: Double, y: Double): Int {
    return (2.5 - signum(y) - 0.5 * signum(x) * signum(y)).toInt()
}

fun signum(n: Double) : Byte {
    return if (n > 0) 1 else -1 
}
