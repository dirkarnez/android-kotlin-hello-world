import kotlin.math.pow

fun pythagorean(a: Double, b:Double): Double {
    return kotlin.math.sqrt(a.pow(2) + b.pow(2))
}

fun main() {
	println("pythagorean ${pythagorean(3.0, 4.0)}")
}
