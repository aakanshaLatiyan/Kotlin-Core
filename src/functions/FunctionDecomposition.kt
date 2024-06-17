package functions

import basic.throwException

/**
 * Function Decomposition is breaking of code into smaller function for reusability and consciseness
 * Basic principles :
 * -> pure function - which is only dependent on its parameter passed
 * -> immutability
 * -> higer order function
 *
 * Design Patterns :
 * -> Monad - it contains either value or exception such as Result
 * -> Functors - functions that can change data structure without changing the original data structure such as map
 * -> Tail recursion - function that call itself at the end of the function is tail recursive function
 */
fun main() {
    val a: Result<Unit> = Result.runCatching { someRiskyOperation() }
    println(a)

    val l = listOf<Int>(1, 2, 3, 4)
    val m = l.map { it * it }
    println(m)

    println(factorial(12))
    println(factorialTailRecursive(12))
}

fun factorial(n: Int, res: Int = 1): Int {
    return if (n == 1) res else factorial(n - 1, res * n)
}

/*
By mentioning tailrec keyword explicitly we are telling compiler that this is a tail recursie function by this way compiler optimize the process internally
by converting recursive loop to iterative loop this way it avoid stack over flow error
 */
tailrec fun factorialTailRecursive(n: Int, res: Int = 1): Int {
    return if (n == 1) res else factorialTailRecursive(n - 1,  n*res)
}


fun someRiskyOperation() {
    throwException()
}