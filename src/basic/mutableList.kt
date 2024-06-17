package basic

/**
 * mutable list are the list which can be altered means element addition and deletion can happen after list is created
 */
fun main() {
    val l1 = mutableListOf("hi","ui","li",2,3,4)
    val l11 = mutableListOf("hi","ui","li",2,3,4)
    val l2 = mutableListOf("a","e","i",22,32,44)
    println("Printing the list $l1")
    println("Printing the list using joinToString ${l1.joinToString()}")
    println("Printing the list using joinToString with -> ${l1.joinToString(" -> ")}")

    println("\nLet's join two list")
    println(l1+l2)

    println("\nLet's check equality of list ")
    println("l1 == l11 then ${l1 == l11}")
    println("l1 == l2 then ${l1 == l2}")

    println("\nAdding element - 3")
    l1.add(3)
    println(l1)

    println("\nRemoving element - hi")
    l1.removeAt(0)
    println(l1)

}