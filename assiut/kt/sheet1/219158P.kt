fun main() {
    val x_first_digit = readln()[0].code.toByte() - 48
    println(if (x_first_digit % 2 == 0) "EVEN" else "ODD")
}
