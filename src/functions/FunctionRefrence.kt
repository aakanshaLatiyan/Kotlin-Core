package functions

/**
 * a function reference is a special link that refers to a certain function by its name and can be called at any time whenever we need it.
 * you can reference functions that belong to a class - objectOrClass::functionName
 * function refrence turns a function into object so that we can pass the refrence for the same
 * if you have option to use lamda and function refrence for the same work prefer function refrence
 * In general, there are four kinds of function references:
 * reference to a function;   - ::functionName
 * reference by Class;        - Class::functionName
 * reference by Object;       - object::functionName
 * reference to a constructor. - ::Class
 *
 */
fun main() {
    //Reference By Function
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddFunction = ::isOdd
    print("Odd numbers: ")
    printNumbers(numbers, oddFunction)
    print("\nEven numbers: ")
    printNumbers(numbers, ::isEven)
    println()

    //Standard Class and Function Reference  or reference by Class
    val decRef = Int::dec   // lambda equivalent = {x-> x.dec()}
    println(decRef(3))

    //Reference By Object
    val p = Person("aakansha")
    val printRef: () -> String = p::printFullName
    //Equivalent lambda
    val printRef2: () -> String = { p.printFullName() }
    println(printRef())
    println(printRef2())

    // Reference By Constructor
    val persorGenerator = ::Person
    val p2 = persorGenerator("aakansha")   // Equivalent lambda - {name -> Person(name)}
    println(p2.name)

}

fun isOdd(x: Int) = x % 2 != 0

fun isEven(x: Int) = x % 2 == 0

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
    for (number in numbers) {
        if (filter(number))
            print("$number ")
    }
}

class Person(val name: String) {
    fun printFullName() = "$name singh"
}

