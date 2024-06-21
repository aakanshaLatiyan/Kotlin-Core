package functions


/**
 * is a function that allows you to add new functions to existing classes without modifying their source code
 * They are static in nature and do not participate in inheritance.
 * Extension functions are used to extend the functionality of already defined class so that we need not to create the same class again just to add a functionality
 * Signature of creating extend functions : RecieverType.MethodName(arguments): ReturnType { body of the function }
 * When we try to execute the extension function on the obj that is reciever obj
 * Extension functions cannot access private properties or methods of the class they are extending
 */
class MyClass(var str: String) {
    fun lowercase(): String {
        return str.plus("From member function")
    }

}
fun main() {
    val a = "chinki"
    // here a is reciever obj since the object is created to be consumed by extension function
    a.extensionFun()
    val obj = MyClass(a)
    println(obj.lowercase())
    println(obj.lowercase())
    println(a.lowercase())

}

//here string would be reciever type since extension function is working on string so whatever the extension function working on some data type it is reciever type
fun String.extensionFun() {
    println("Hi $this from string extension")
}

fun String.lowercase(): String {
    return this.plus("lowercase")
}

//if we write a extension function that is same as member function of class then
// whenever we try to run extension function it always excecute member function
fun MyClass.lowercase(): String {
    return this.str.plus("From extension function")
}

// if we try to write a function that is same as already declared extension function i.e its declaration is same but body is different
// then it will throw error
//fun MyClass.lowercase(): String {
//    return this.str.plus("From extension function 2")
//}