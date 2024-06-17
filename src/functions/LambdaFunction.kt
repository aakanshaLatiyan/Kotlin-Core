package functions

/**
 * to create a function at runtime and without a predefined name. That's lambda
 * to create a function without any name we have two ways
 * anonymous function - fun(arguments): ReturnType { body }
 * lambda - { arguments -> body }
 */
fun main() {

//    anonymous function
    val anonymsFn = fun() {
        println("hi i am inside anonymous function ")
    }
    anonymsFn()

    val anonymsFn2 = fun(a: Int): Int {
        println("hi i am inside anonymous function ")
        return a
    }
    anonymsFn()

//    simple lambda with no arguments
    val a = { println("hii") }

//    lambda with two or more arguments
    val b = { a: Int -> a * a }

    a()
    println(b(3))

    val str = "I don't know... what to say..."
    println(str.filter({ c -> c != '.' }))
    println(str.filter { c -> c != '.' })
}
