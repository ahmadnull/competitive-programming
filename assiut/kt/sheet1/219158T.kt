fun main() {
    val array = readln().split(" ").map { it.toInt() }

    // Print the values in ascending order
    array.sorted().forEach { println(it) }

    // Print a blank line
    println()

    // Print the values in the sequence as they were read
    array.forEach { println(it) }
}
