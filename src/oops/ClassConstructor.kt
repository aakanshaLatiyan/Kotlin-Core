package oops

/**
 * constructor are used to provide values to the class properties and to add any intialization logic there
 * two types - primary & secondary
 * primary - these are written while class is getting declared , it does not contain any logic
 * secondary - these are written inside the class body and can contain intialization logic as well
 * init blocks - are used to put any logic that we can not put in primary constructor they are executed in order they r written
 */
class ClassConstructor(val name: String) {//primary constructor
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) { //secondary constructor
        println("Secondary constructor called")
        if(age>=5) this.age = age
    }

    init { //init block
        println("$name -> can be accessed here but not anywhere in the class")
    }

    init {
        try {
            require(name.isNotEmpty()) //it is to check weather the parameter passed is up to mark or not
        } catch (e: IllegalArgumentException) {
            println("Name can not be empty ")
        }
        println("$name -> Second init block they executed in order they written ")
    }

    init {
        println("$name -> Added another one to check the order\n")
    }

//    name  -> can not access this unless you assigned to class property
}

class Person {
    var name: String
    var lastName: String
    var age: Int

    constructor(name: String, lName: String, age: Int) {
        this.lastName = lName
        this.name = name
        this.age = age
    }
}

fun main() {
    val obj = ClassConstructor("chinks",3)
    val obj2 = ClassConstructor("")
    val obj3 = ClassConstructor("maya")
    val obj4 = ClassConstructor("tina", 18)
    println("${obj.name}  ${obj.age}")
    println("${obj2.name}  ${obj2.age}")
    println("${obj3.name}  ${obj3.age}")
    println("${obj4.name}  ${obj4.age}")

    println("\nPersons Object --------------->")
    val pObj2 = Person(name = "chinki", lName = "sin", age = 8)
    println(pObj2.lastName)
}