package Basic

/**
 * In kotlin there are 6 relational operator ,
 * ==,!=.<,<=,>,>=
 * Equality check can only be applied for the same type if used different type it will throw error see line 19
 */
fun main() {
    val num1 = 1
    val num2 = 23
    val num3: Long = 23L

    println(num1==num2)
    println(num1!=num2)
    println(num1<=num2)
    println(num1>=num2)
    println(num1<num2)
    println(num1>num2)
//    println(num3==num2)

}