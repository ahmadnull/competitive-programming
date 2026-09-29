fun main() {
    val s1HashCode = readln().split(" ")[1].hashCode()
    val s2HashCode = readln().split(" ")[1].hashCode()
    println(if (s1HashCode == s2HashCode) "ARE Brothers" else "NOT")
}
