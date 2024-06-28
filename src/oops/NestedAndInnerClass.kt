package oops

import java.awt.Color

/**
 * Nested Class
 * a class within another class and such classes are called nested.
 * They help us group classes logically and increase the encapsulation of our code.
 * The Superhero class is often called an outer class,
 * a nested class, along with its properties, functions, and constructors, is a member of an outer class
 * nested class is not really connected with the outer class
 *
 * A regular nested class cannot access members of its outer class. But a nested class marked as an inner class can
 * An inner class can access all members of its outer class
 */

//outer class
class SuperHero {
    val power = 100
    val hammerPower = power * Hammer().hPower
    val coatPower = power * MagicCoat().mPower

    fun printPower() {
        println("$power is superhero power")
    }

    //nested class
    class Hammer {
        //        power  - properties of outer class can not access here
        val hPower = 1000

        fun printPower() {
            println("$hPower is hammer power")
        }
    }

    class MagicCoat {
        val mPower = 2000

        fun printPower() {
            println("$mPower is magicCat power")
        }
    }
}


//outer class
class Cat(val name : String,val color: String) {

    fun sayMeow() {
        println("Meowww by $name of $color")
    }

    //inner class by using this you can access outer class properties
    inner class Bow(val color: String) {

        fun setBow() {
            sayMeow()
            // to access outer class fields which is same name you can use this@Cat
            println("Bow set for $color but original was ${this@Cat.color}")
        }
        fun printBowColor() {
            println("$name weraring $color color")
        }
    }

    //we can use inner class anywhere in the outer class
    val bowColor = Bow("blue")
}

fun main() {
    //To create obj of nested class we use classname.nestedclass
    val hammerObj = SuperHero.Hammer()
    val coatObj = SuperHero.MagicCoat()
    val superHero = SuperHero()

    superHero.printPower()
    hammerObj.printPower()
    coatObj.printPower()

    val cat = Cat("Cat 1","green")
    //To access the inner class, you need to instantiate the outer class first, as inner classes are associated with an instance of their enclosing class
    val bow = cat.Bow("Red")

    bow.printBowColor()
    bow.setBow()
    println(cat.bowColor.color)
}