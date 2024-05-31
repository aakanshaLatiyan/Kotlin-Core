package Basic

/**
 * val
 * is used when we want to assign value single time and it won't change after that(Immutable Property)
 * if we try to change it, it will throw error (refer line 13 will throw -> Kotlin: Val cannot be reassigned)
 */

/**
 * var
 * is used when we want to reassign the value of variable after some time (mutable property)
 */

/**
 * Type Infrencing
 * while declaring variable its up to programmer if they want to explicitly define the type of the variable (refer line : 25) where we have declared variable explicitly
 * When compiler automatically predict the type of teh variable then this process is called Type Inferencing
 */

/**
 * const val
 * The variable declared with const val is used when we want to declare constants and want to compiler know at the compile time
 * can not declare in local scope that is inside function
 * assigned value must be primitive(boolean, byte, char, double, float, int, long, short) or string
 * if not assigned with primitive or string will throw error(Refer Line 31)->Const 'val' has type 'Array<Int>'. Only primitives and String are allowed
 ******* diff b/w val and const val
 * val can assign value at run time whereas const val should assign value only at compile time
 */

const val MY_CONSTANT = "This is my constant varibale "
//const val TRY_RUN_TIME_CONSTANT = arrayOf(1,2)
fun main() {
    //variable Declaration as val
    val myVariable = 5
    //myVariable = 6
    val myVariable2: Int = 5
    val myStringVariable = "Hi"
    val myStringVariable2: String = "Hi"

    //variable Declaration as var
    var myVarVariable = 5
    myVarVariable = 6
    var myVarVariable2: Int = 5
    myVarVariable2 = myVariable2 +5

    var myVarStringVariable = "Hi"
    myVarStringVariable += "kotlin"
    var myVarStringVariable2: String = "Hi"
    myVarStringVariable2 += "Again Kotlin"


    println(myVariable)
    println(myVariable2)
    println(myStringVariable)
    println(myStringVariable2)
    println(myVarVariable)
    println(myVarVariable2)
    println(myVarStringVariable)
    println(myVarStringVariable2)
    println(MY_CONSTANT)
}