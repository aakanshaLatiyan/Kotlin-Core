package functions

import javax.sound.midi.Instrument

/**
 * scope functions that help you perform operations on an object within a certain scope.
 *  five scope functions in Kotlin: let, run, with, apply, and also.
 *  They don't perform any specific actions but just organize your code and execute certain operations in the object context
 *  These functions create a temporary scope for objects and invoke code from lambdas.
 *
 *  Apply ->
 *  The context object is available as this.
 *  The function returns the context object
 *  apply is commonly used for object setting like parameter setting of object
 *
 *  Also ->
 *  The context object is available as it.
 *  The function returns the context object
 *  also is used when we want to do additional work with obj
 */

data class Musician(val name: String, var instrument: String,var band: String)
fun main() {
    //without apply
    //without apply our code became heavier and received a new variable
    //without apply, all operations are located on the same level
    val musician = Musician("A.R Rheman","sticks","band1")
    println(musician)
    //alter the musician object update that he plays guitar and band change for band2
    musician.band = "band2"
    musician.instrument = "guitar"
    println(musician)

    //with Apply
    // we have operations conveniently grouped
    val mus1 = Musician("kartik","drum","OldBand").apply {
        //alter the musician object update that he plays guitar and band change for band2
        println(this)
        band = "NewBrand"
        instrument = "flute"
        println(this)
    }
    println("Printing obj return from of apply")
    println(mus1)


    //also -- we have taken obj and showing that he
    mus1.also {
        println("${it.name} is working with ${it.band}")
    }
    //when using also if it is assigned to any variable it will return the context of the obj and then do the work inside also
    var a = 10
    var b = 5
    a = b.also { b = a }
    println("a = $a & b = $b")

    var str1 = "Hello"
    val str2 = str1.also { str1 = it.reversed() }
    println("str 1 is $str1 and str2 is $str2")

}