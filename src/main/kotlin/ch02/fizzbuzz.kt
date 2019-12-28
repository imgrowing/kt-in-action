package ch02

fun main(args: Array<String>) {

    // n % 3 == 0 : fizz
    // n % 5 == 0 : buzz
    // n % 3 == 0 && n % 5 == 0 : fizz, buzz

    for (i in 1..100) {
        println("$i: ${fizzbuzz(i)}")
    }

    println("==========================")

    // 100 부터, 짝수만
    for (i in 100 downTo 1 step 2) {
        println("$i: ${fizzbuzz(i)}")
    }
}

fun fizzbuzz(i: Int): String =
    when {
        i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> ""
    }