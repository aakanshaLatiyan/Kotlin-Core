package basic

/**
 * For conditional check we have if-else , if-else-if, nested if , when
 * if is an expression that can assign value to variable
 */
fun main() {
    makeIfAsExpression()
    letsUseWhen()
    whenAsExpression()
    whenWithRanges()
}

fun whenWithRanges() {
    val number = 15

    when {
        number < 0 -> println("Negative number")
        number in 1..10 -> println("Number between 1 and 10")
        number % 2 == 0 -> println("Even number")
        else -> println("Odd number greater than 10")
    }
}

fun whenAsExpression() {
    val number = 3
    val message = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Number is greater than four"
    }

    println(message)
}

fun letsUseWhen() {
    val number = 5

    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Number is greater than four")
    }
}

fun makeIfAsExpression() {
    val num1 = 5
    val num2 = 54

    val min = if(num1 < num2) {
        println("$num1 is smaller")
        num1
    } else {
        println("$num2 is smaller")
        num2
    }

    println(min)
}
