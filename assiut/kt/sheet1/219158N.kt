fun main() {
    val x = readln()[0].code.toInt()
    println(if (x in 65..90) (x + 32).toChar() else (x - 32).toChar())
}
