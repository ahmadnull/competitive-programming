fun main() {
    val x = readln().toDouble()
    println(when {
                (25 >= x && x >= 0) -> "Interval [0,25]"
                (50 >= x && x > 25) -> "Interval (25,50]"
                (75 >= x && x > 50) -> "Interval (50,75]"
                (100 >= x && x > 75) -> "Interval (75,100]"
                else -> "Out of Intervals"
            })
}
