fun main() {
    var n = readln().toInt()

    val y = n / 365
    n -= y * 365

    val m = n / 30
    n -= m * 30

    println("$y years\n$m months\n$n days")
}
