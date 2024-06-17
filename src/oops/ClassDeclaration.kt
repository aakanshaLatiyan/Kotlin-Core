package oops

class ClassDeclaration {
    //properties of classs , when want to declare property run time then use var else for compile time use val
    var property1 = "property1"
    val property2: NewType = NewType()
}

class NewType {
    var p1 = 0
}

fun main() {
    //you can also declare class inside a function although mostly class declared are on top level
    class MyClass

    val obj = ClassDeclaration()
    println("obj ->  ${obj.property1}  ${obj.property2.p1}")
    obj.property1 = "New Property 1"
    obj.property2.p1 = 4
    println("obj ->  ${obj.property1}  ${obj.property2.p1}")
}