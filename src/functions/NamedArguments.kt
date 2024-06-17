package functions

/**
 * Named Arguments are provided via function call to increase code redaibility
 * While using Default Argument we may not be abel to use n argument until n-1 is provided if though is n-1 is default value
 * we can use named arguments to utilize the default value
 */
fun main() {
    HandleArgs(50,"i dont want to give this",true)
    HandleArgs(arg1 = 50, arg3 = true)

    //combine positional and named args when combining make sure they are in correct order
    HandleArgs(50, arg3 = true)
}

fun HandleArgs(arg1: Int,arg2: String = "no need to give i have deafult value",arg3: Boolean) {
    println("HandleArgs called with $arg1 ,$arg2 ,$arg3")
}