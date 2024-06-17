package basic

/**
 * String is nothing but the sequence/group of characters
 * it is immutable means you can not change once declared thatis if you do something like this s = "hello"
 * then you can not do s[4]= 'r' this is you can not change its internal state
 * instead you can reassign it s = "hellr
 */
fun main() {
    val s = "Hello"
    println("Firsst char is ${s.first()}")
    println("Last char is ${s.last()}")
    println("Length of s  is ${s.length}")
    println("Is s  empty  ${s.isEmpty()}")
    println("Char at 0 index is ${s[0]}")
//    s[0] = 'g'  we can not do like this bcoz it is immutable
}