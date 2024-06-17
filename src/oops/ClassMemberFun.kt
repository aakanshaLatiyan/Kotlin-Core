package oops

class ClassMemberFun(val name: String, val age: Int) {
    fun printProperties() {
        println("I am printing object properties ----> ${name}  ${age}")
    }

}

fun main() {
    val obj = ClassMemberFun("chinks", 15)
    obj.printProperties()
}