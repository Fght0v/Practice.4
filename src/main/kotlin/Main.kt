package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    printFullName("Виктория", "Чеусова")
    printFullName(firstName = "Виктория", lastName = "Чеусова")

    val name = calculateFullname("Вистория", "Чеусова")

    println(calculateFullname("Виктория", "Чеусова"))
    println(calculateFullname2(name))

    println(isPrime(4))

    println(fibonacci(3))
}

fun printFullName(firstName: String, lastName: String) {
    println("$firstName $lastName")
}

fun calculateFullname(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

fun calculateFullname2(firstName: String): Pair<String, Int> {
    return Pair(firstName, firstName.length - 1)
}

fun isPrime(number: Int): Boolean {
    return number > 1 && (2 until number).none { number % it == 0 }
}

fun fibonacci(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}