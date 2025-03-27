// https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type
fun main() {
    var func: (Int, Int) -> Int = { a, b -> a + b }
    println("Hello, world!!! ${func(1, 2)}")

    val a = { i: Int -> i + 1 } 
    fun(s: String): Int { return s.toIntOrNull() ?: 0 }
    fun(x: Int, y: Int): Int = x + y

    // [Higher-order functions and lambdas | Kotlin Documentation](https://kotlinlang.org/docs/lambdas.html#it-implicit-name-of-a-single-parameter)
     { it.length == 5 }
    
    val list = listOf(1, 2, 3)
    println("Hello, world!!! ${list.filter({it > 1})}")
    println("Hello, world!!! ${list.filter({a -> a > 1})}")
    println("Hello, world!!! ${list.filter{a -> a % 2 == 0}}")
    println("Hello, world!!! ${list.filter(fun(a: Int): Boolean { return a > 0 })}")
}
