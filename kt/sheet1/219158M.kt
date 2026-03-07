fun main() {
    val x = readln()[0].code.toByte()
    println(when {
                x in 48..57 -> "IS DIGIT"
                x in 65..90 -> "ALPHA\nIS CAPITAL"
                else -> "ALPHA\nIS SMALL"
            })
}
