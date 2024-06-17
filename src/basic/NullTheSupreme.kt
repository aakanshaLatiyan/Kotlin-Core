package basic

/**
 * Kotlin supports both variable null and non-nullable variable
 * to store null value need to explicitly declare that this variable may contains null by adding ? to data type
 * if trying to access property of a variable that is null it won't compile (Line 11)
 * to access property of nullable variable we need to use safe call operator ?.
 * while accessing property if length is there it will print length else null
 * We can avoid NPE by safe call , elvis operator , non-null assertion , safe casting , let block
 * elvis operator - ?: it assign the default value if variable is null (line 20)
 * we can explicitly make sure that value is non null by using !! if the variable is null then NPE is thrown at run time (line 23)
 * we can use safe cast to avoid NPE by using as?
 * we can use let block to avoid the code that needs to be executed only when variable is not null
 */
fun main() {
//    val str: String = null
    var str: String? = null
//    println(str.length)
    println(str?.length)
    println(str?.length ?: 0)

    //non - null assertion
//    println(str?.length!!)

    //safe casting
    println(str as? String)
    str = "hiiii"
    println(str as? String)


    //let block
    str?.let {
        println("executed if not null")
    }

    str = null
    str?.let {
        println("executed if not null")
    }
}