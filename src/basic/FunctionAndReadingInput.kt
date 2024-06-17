package basic

import java.util.Scanner

/**
 * Function is nothing but properly giving instruction in order to achieve some sub task
 * To declare a function:
 * fun functionName(argument1: argumentType,argument2: argumentType): returnType (refer From Line - 12 to 14)
 * to invoke a function just write the function name followed with argumnents in the paranthesis :
 * functionName(2,5) (refer line 11)
 * All function return Unit if return Type is not specified
 */

/**
 * Taking Input from the User
 * we can use readLn() which reads a single line from the terminal and process in it (refer line 19,20)
 *
 * readln() works fine for simpler input but for complex input such as input number in a single line seperated by space won't work with readlin as
 * it just reads a line not individual word
 * Here comes Scanner class from java which has several functions to take complex input such as int double etc
 *
 */
fun main() {
    println("Inpput a number1 readlin")
    val argument1 = readln().toInt()
    println("Inpput a number2 readlin")
    val argument2 = readln().toInt()
    val res = functionName(argument1,argument2)
    println(res)

    val res2 = functionDoesNotReturn(2)
    println(res2)

    println("Lets how to take input from scanner class")
    functionWithScannerInput()

//    create 4 diff variable
    val (a,b,c,d) = "hi my name is chunku".split(" ")

}

fun functionWithScannerInput() {
    //initialize scanner class
    val scanner = Scanner(System.`in`)
    println("Enter a string with single word :")
    val inputStringWord = scanner.next()

    println("Enter a Int :")
    val inputInt = scanner.nextInt()

    scanner.skip("\\R?")
    print("Enter a string whole line :")
    val inputString = scanner.nextLine()

    println("Enter a Double :")
    val inputDouble = scanner.nextDouble()

    println("Enter a boolean :")
    val inputBoolean = scanner.nextBoolean()

    println(inputStringWord)
    println(inputInt)
    println(inputString)
    println(inputDouble)
    println(inputBoolean)



}

fun functionName(argument1: Int, argument2: Int): Int {
    return argument1 + argument2
}

fun functionDoesNotReturn(argument1: Int) {
    println("Executing inside function that does not return anything $argument1")
}