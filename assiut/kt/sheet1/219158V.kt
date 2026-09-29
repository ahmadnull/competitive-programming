fun main() {
    val input = readln().split(" ")
    val a = input[0].toByte()
    val b = input[2].toByte()
    val s = input[1][0]
    
    println(if (
                s == '=' && a == b ||
                s == '>' && a >  b ||
                s == '<' && a <  b 
            ) "Right" else "Wrong")
}
