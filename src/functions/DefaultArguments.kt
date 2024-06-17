package functions

/**
 * Default Arguments are the arguments in the function which in need when not passed will given the default value
 * Until you have not passed n-1 arguments you can not pass n argument
 */
fun main() {
    println(dr1(1,2,3))
    println(dr1(1))

    println(dr2(1,2,3))
//    println(dr2(1,3))  //can not use like this we assume that b will take default value instead 3 goes to b and c remains unassigned
    println(dr2(1,2,3))

//    println(dr3(2,3))
    println(dr4())
}

fun dr1(a: Int ,b: Int = 0,c: Int = 0):Int {
    return a
}

fun dr2(a: Int,b: Int = 0,c: Int):Int {
    return a
}

fun dr3(a: Int = 0,b: Int,c: Int):Int {
    return a
}

fun dr4(a: Int = 0,b: Int = 0,c: Int = 0):Int {
    return a
}