/**
 * Annotation contain the information which will tell compiler to perform some task
 * or it can contain information about meta data which makes data to be more useful
 * When annotation is applied to two or more line only the line below annotation will be able to use it
 * two or more annotation can be applied to single line
 * Annotation targets are all kinds of annotated elements, such as classes, functions, properties, and expressions
 * Some annotation can work with all the elements while some will work with few elements
 */

@file:Suppress("UNUSED_EXPRESSION")  // this way you can apply annotation to the whole file by using this numbers like 123 , 456 are not throwing warning of not getting used
fun main() {
    @Suppress("CanBeVal")
    //is an annotation that tells the compiler to suppress a specific warning, which is passed in quotation marks in the parentheses
    var num = 5
    println(num)
    123
}

@Suppress("CanBeVal")
fun functionAsAnnotationTarget() {
    // @Suppress("CanBeVal")  if i applied it here then it will only work on line below it if want apply on whole function we need to write it before function
    var num = 5
    var str = "Hello"
    println(num)
    println(str)
    455
}


@Suppress("unused") // this is applied to all the values and lines in the  class
class MyClass {
    private var num = 5
    private var num2 = 5
    private var num3 = 5
    fun print() {
        println(num)
        println(num3)
        println(num2)
        5667
    }
}