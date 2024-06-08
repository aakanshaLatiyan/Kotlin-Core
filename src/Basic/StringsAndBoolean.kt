package Basic

import java.util.*

/**
 * String and Boolean are two data types
 * String is used to store one or more character (which can include int , float etc)
 * Boolean can store true or false
 */
fun main() {
    val str = "Hello"
    val b0 = "true"
    val b1 = "True"
    val b2 = "false"
    val b3 = "False"

    println(str.length)
    println("I'm learning Kotlin!\n".repeat(6))
    println(str.reversed())

//    toBoolean is case insensitive
    println(b0.toBoolean())
    println(b1.toBoolean())
    println(b2.toBoolean())
    println(b3.toBoolean())

//    toBooleanStrict is case sensitive and if try to convert boolean(some case insensitive)  then it will throw error refer line 26 & 28
    println(b0.toBooleanStrict())
//    println(b1.toBooleanStrict())
    println(b2.toBooleanStrict())
//    println(b3.toBooleanStrict())

    val spell = "abra"
    println((spell + "cad").repeat(spell.length) + spell)
}
