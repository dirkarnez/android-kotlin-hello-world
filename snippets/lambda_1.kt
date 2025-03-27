// https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type
fun main() {
    var func: (Int, Int) -> Int = { a, b -> a + b }
    println("Hello, world!!! ${func(1, 2)}")

    val a = { i: Int -> i + 1 } 
    fun(s: String): Int { return s.toIntOrNull() ?: 0 }
    fun(x: Int, y: Int): Int = x + y

    // [Higher-order functions and lambdas | Kotlin Documentation](https://kotlinlang.org/docs/lambdas.html#it-implicit-name-of-a-single-parameter)
     { it.length == 5 }
}
