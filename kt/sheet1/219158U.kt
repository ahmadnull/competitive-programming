fun main() {
    val n = readln().toDouble()
    val remainder = n % 1.0
    println(if (remainder == 0.0) String.format("int %.0f", n) else String.format("float %.0f %f", n - remainder, remainder))
}
