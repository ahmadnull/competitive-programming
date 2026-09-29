fun main() {
    val input = readln().split("(?=[+\\-*/])".toRegex())
    val result = when (input[1][0]) {
        '+' -> input[0].toInt() + input[1].substring(1).toInt()
        '-' -> input[0].toInt() - input[1].substring(1).toInt()
        '*' -> input[0].toInt() * input[1].substring(1).toInt()
        '/' -> input[0].toInt() / input[1].substring(1).toInt()
        else -> null
    };
    println(result)   
}
