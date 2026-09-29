fun main() {
    val values = readln().split(" ")
    val i: Int = values[0].toInt()
    val l: Long = values[1].toLong()
    val c: Char = values[2][0]
    val f: Float = values[3].toFloat()
    val d: Double = values[4].toDouble()

    println("$i\n$l\n$c\n$f\n$d")
}
