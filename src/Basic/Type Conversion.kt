package Basic

/**
 * Type Conversion also known as type casting
 * It means conversion of one data type to another
 * Two types of casting - Implit and explicit
 * Implicit casting is not allowed in kotlin due to concern of data loss
 * when implict conversion is tried on line 12 it will throw error type mismatch
 *
 */
fun main() {
    var longVar: Long = 1003485793745973844L
    var int1: Int = 12
//    val intVal: Int = longVar
//    longVar = int1
    val int2: Int = longVar.toInt()
    val short1: Short = longVar.toShort()
    val byte1: Byte = longVar.toByte()

//    check for null
    val s: String? = null
    val i: Int? = s?.toInt()

//    safe casting here as is the operator for safe casting
    val str: String = "hello"
    val checkForStr = str as? String
    val checkForInt = str as? Int

//    We can also check for safe casting by usinh is operator
    if (checkForStr is String) {
        println("valid string by safecasting")
    }
//   it will not be printed since checkForInt is not int
    if (checkForInt is Int) {
        println("valid int by safecasting")
    }

    println(int2)
    println(short1)
    println(byte1)
    println(int1)
    println(i)
    println(checkForStr)
    println(checkForInt)

}