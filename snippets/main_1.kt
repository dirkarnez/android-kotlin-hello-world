
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Hello, world!!! ${java.time.LocalDate.now()} ${add(10, 3)} ${kotlin.random.Random.nextInt(0, 100)}")
}