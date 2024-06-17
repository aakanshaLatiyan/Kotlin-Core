package basic

/**
 * Range is similar to when we check if this lies between 5 to 10
 * We can check the same by num >= 5 && num <= 10
 * but kotlin provides us a better way to make it concise by using ..
 * .. is closed range if written like this 2..5 it will have 2,3,4,5
 * so how can i get the rance such that it consists 2,3,4 not 5
 * we can substract 1 or we can use 2..<5
 */
fun main() {

    println("\nPrinting a closed range from 2 to 5")
    for (i in 2..5) {
        print(i)
    }
    println("\nPrinting a open range from 2 to 5")
    for (i in 2..<5) {
        print(i)
    }

    println("\nPrinting char range ")
    for (i in 'a'..'d') {
        print(i)
    }

    println()

    println("hg" in "he".."hi")

    println(5 in 5..15)  // true
    println(12 in 5..15) // true
    println(15 in 5..15) // true
    println(20 in 5..15) // false
    println(5 in 5..<15)  // true
    println(15 in 5..<15) // false
}