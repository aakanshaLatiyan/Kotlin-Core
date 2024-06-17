package oops

/**
 * We can have multiple constructor - Every secondary constructor has to have a unique signature.
 * You cannot use the same signature for the primary or any other constructor.
 * The constructor signature consists of the number, the types, and the order of the parameters.
 * To create a valid constructor, you need to make sure it has a unique list of parameters.
 * val & var is not allowed in secondary constructor
 */
class SecondaryConstructor {
    var width = 0
    var height = 0

    constructor(width: Int,height: Int) {
        this.width = width
        this.height = height
    }

    constructor(width: Int) {
        this.width = width
    }

    fun printProperties() = println("Printing obj properties -> $width $height")
}

fun main() {
    val obj = SecondaryConstructor(4,3)
    //this will not work until you explicitly declared primary constructor like SecondaryConstructor() or secondory constructor like constructor()
//    val obj2 = SecondaryConstructor()
    val obj2 = SecondaryConstructor(4)
    obj.printProperties()
    obj2.printProperties()
}