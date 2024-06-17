package collections

/**
 * Every collection is either mutable or immutable
 * immutable collection means data inside the collection won't be changed but can access it
 * mutable collection means data can be accessed and altered both
 * three type of collections are there :
 * list - in which data can be inserted and accessed via index it can contain duplicate elements
 * set - in which data can be in any oder just that it won't contain any duplicate elements  if value stored in inserted again it will overwrite it
 * map - in this data are stored in form of key - value pair and the key won't be duplicate different key can contain same value
 */
fun main() {
    val list = listOf(1,2,3)
    val mutableList = mutableListOf(1,2,3)

    println("List is ${list.joinToString()}")
    println("Mutable List is ${mutableList.joinToString()}")

    println("Lets add element in list")
//    list.add(1)
    mutableList.add(4)
    println("List is ${list.joinToString()}")
    println("Mutable List is ${mutableList.joinToString()}")

    val set = setOf(1,4,2,3,4,3,2)
    val mutableSet = mutableSetOf(1,4,2,2,3,4,3,2)
    mutableSet.add(6)
    println("Set is ${set.joinToString()}")
    println("Mutable Set is ${mutableSet.joinToString()}")

    val map = mapOf(1 to "hi",2 to "bye")
    val mutableMap = mutableMapOf(1 to "hi",2 to "bye")
    mutableMap.put(3,"see ya")
    println("map is $map")
    println("Mutable map is $mutableMap")

    println(list.contains(4))
    println(set.contains(4))
    println(map.contains(2))
    println(list.indexOf(4))
    println(set.indexOf(4))

    //instead of contains you can use in it is preferred
    println(2 in list)

    mutableList.clear()
    mutableMap.clear()
    mutableSet.clear()
    println("Mutable Set is ${mutableSet.joinToString()}")
    println("Mutable map is $mutableMap")
    println("Mutable List is ${mutableList.joinToString()}")

}