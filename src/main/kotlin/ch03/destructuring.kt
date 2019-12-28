package ch03

fun main(args: Array<String>) {
    val pair = 1 to "one" // infix calling (중위 호출)
    val (num, numName) = pair
    println("$num : $numName") // 1 : one
}