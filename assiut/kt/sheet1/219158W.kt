fun main() {
    val input = readln().split(" ")
    val result = evaluate(input[0].toInt(), input[1][0], input[2].toInt())
    println(if (input[4].toInt() == result) "Yes" else result)
}

fun evaluate(operand1: Int, operation: Char, operand2: Int): Int? {
    return when (operation) {
        '+' -> operand1 + operand2
        '-' -> operand1 - operand2
        '*' -> operand1 * operand2
        '/' -> operand1 / operand2
        else -> null
    }
}
