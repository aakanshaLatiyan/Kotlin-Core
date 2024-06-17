package functions

/**
 * Function in kotlin are treated as first class citizen - means they can be treated as objects
 * in result of feature of the functional language enables more flexible and expressive code
 * :: this is called function refrence operator
 */
fun main() {

    val a: (String) -> Unit = { name -> println("hello $name") }
    a("chinki")

    println("Function as arguments -------------->")
    println(functionAsArguments(fn = { 6 }))
    println(functionAsArguments { 7 })
    println(functionAsArguments2(a = 2, fn = { it * it }))
    println(functionAsArguments2(3) {
        it * it
    })

    println("\nReturn Function from a Function --------------->")
    val rf = returnFunction()
    println(rf("chinki"))
    val rf2 = returnFinction2()
    rf2()
    returnFinction2()()  // simpler version of above 2 lines
    val rf3 = returnFunction3("chinki")
    println(rf3("chinki2"))
    println(returnFunction3("chinki")("hello"))


    println("\nLet's make collection of function")
    val listOfFunction = listOf<(Int) -> Int>(
        { num -> num * num },
        { num -> num + num },
        { num -> num - num },
        { num -> num / num },
    )

    println(listOfFunction.get(0)(2))
    println(listOfFunction.get(1)(4))
    println(listOfFunction.get(2)(2))
    println(listOfFunction.get(3)(2))

    println("\nPass function as refrence -------------------->")
    println(functionAsArguments(::fn))
    println(functionAsArguments2(3, ::fn2))


}

fun fn(): Int {
    return 4
}

fun fn2(x: Int): Int {
    return x
}

fun functionAsArguments(fn: () -> Int): Int {
    return fn()
}

fun functionAsArguments2(a: Int, fn: (Int) -> Int): Int {
    return fn(a)
}

fun returnFunction(): (String) -> String {
    return { name -> name + " is an engineer" }
}

fun returnFinction2(): () -> Unit {
    return { println("I executed and returned a function") }
}

fun returnFunction3(name: String): (String) -> String {
    return { a -> name }

}