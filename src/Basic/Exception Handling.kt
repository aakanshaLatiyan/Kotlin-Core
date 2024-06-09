package Basic

/**
 * Exception are the events that disrupts the normal flow of the program
 * they are the objects that contain information about error
 * to throw an exception we need to use throw keyword along with Exception()  (see line 12)
 * to handle exception we use try catch block
 * try block is used to write that piece of code in which exception can occur
 * catch block is to write the work we need to do if we caught exception
 * finally block is to write that code regardless of code that executed in try and catch it will always run
 */
fun main() {
//    throwException()
    try {
        println("First try block")
        throwException()
    } catch (e: Exception) {
        println("I caught the exception")
    } finally {
        println("Finally block for first try")
    }

    try {
        println("second try block")
        doesNotThrowException()
    }catch (e: Exception) {
        println("I caught exception for second try block")
    }finally {
        println("Finally block for second try")
    }

    val tryAsExpression = try {
        println("third try block")
        doesNotThrowException()
        1
    }catch (e: Exception) {
        println("I caught exception for third try block")
        2
    }finally {
        println("Finally block for third try")
    }

    println(tryAsExpression)
}

fun throwException() {
    throw Exception()
}

fun doesNotThrowException() {
    println("function that does not throw exception just runs")
}