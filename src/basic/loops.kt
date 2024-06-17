package basic

/**
 * repeat(n) - it repeats whatever written inside repeat to n times
 * if n is 0 or -ve it will not execute anything
 *
 * while(condition) - loop includes a condition,  If true, the loop runs. They are repeated until the condition becomes false
 *
 * do { } while(condition) - first it executed the statement under do then executed while loop
 */
fun main() {

    repeat(4) {
        println("Hi printed ${it + 1} times")
    }

    println("repeat block for 0------------------------------------>")
    repeat(0) {
        println("Hi printed ${it + 1} times")
    }

    println("repeat block for -ve n------------------------------------>")
    repeat(-4) {
        println("Hi printed ${it + 1} times")
    }

    println("\n\nlets try while ----------------------------------->")
    var i = 0
    while (i < 5) {
        println("Hi printed ${i + 1} times")
        i++
    }

    println("\n\nlets try do-while ----------------------------------->")
    do {
        println("hi me inside do with ${i}")
        i++
    } while (i <= 7)

}