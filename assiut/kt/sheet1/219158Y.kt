import kotlin.math.pow
import java.math.BigInteger

fun main() {
    val array = readln().split(" ").map { it.toInt() }
    println(String.format("%02d", last_n_digits(product(array), 2)))
}

fun product(array: List<Int>): BigInteger {
    var result = BigInteger("1")
    array.forEach { result = result.multiply(it.toBigInteger()) }
    return result
}

fun last_n_digits(i: BigInteger, n: Int): Int {
    return (i % 10.0.pow(n).toInt().toBigInteger()).toInt()
}