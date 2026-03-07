fun main() {
    val (n_last_digit, m_last_digit) = readln().split(" ").map { it.last().digitToInt() }
    println(n_last_digit + m_last_digit)
}
