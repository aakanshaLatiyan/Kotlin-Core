package basic

/**
 * Char is single character stored inside single ' '
 * it can have letter digit number or unicode character which represent charcter inb unicode form
 * unicode stores value in hexadecimal value where as .code represent decimal value
 */
fun main() {
    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'
    val ch = '\u0040'

    println(lowerCaseLetter)
    println(upperCaseLetter)
    println(number)
    println(space)
    println(dollar)
    println(ch)

    println("code of ch is ${ch.code}")
    println("code of number 1 is ${number.code}")
    println("code of upper case Q is ${upperCaseLetter.code}")
    println("code of lowe case a is ${lowerCaseLetter.code}")
    println("code of $ is ${dollar.code}")

    println("We can add / substract on character --------------->")
    println(upperCaseLetter + 1)
    println(upperCaseLetter - 1)

    //    this will throw error as encountring 1 before suggest the compiler that it is int and founding char after that result an error
//    println(1+upperCaseLetter)

//    But not multiply or divide among char
//    println(upperCaseLetter * 1)
//    println(upperCaseLetter / 1)

    println("Escape sequence are the special character in program that start with \\")
    print("New Line character ")
    println('\n')

    print("tab character ")
    print('\t')
    println("tab printed")

    print("carriage return  character")
    print('\r')
    println("cariage return printed")

    print("backslash character ")
    println('\\')

    print("single quote mark character ")
    println('\'')

    print("double quote mark character ")
    println('\"')

    println("we can also use relational operator on char -------------->")
    println(upperCaseLetter<lowerCaseLetter)

    println("Some Common functions that gets used ------------->")
    println(upperCaseLetter.isLetterOrDigit())
    println(number.isDigit())
    println(lowerCaseLetter.uppercase())
}