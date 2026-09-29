fun main() {
    val person1 = readln().split(" ")
    val person2 = readln().split(" ")
    println(if (person1[1] == person2[1]) "ARE Brothers" else "NOT")
}
