package ch03

fun main(args: Array<String>) {
    val s = "123.45-678"
    println(s.split('.'))       // [123, 45-678]
    println(s.split('-'))       // [123.45, 678]
    println(s.split('.', '-'))  // [123, 45, 678]

    println(s.split("\\.".toRegex()))         // [123, 45-678]
    println(s.split("\\.|-".toRegex()))       // [123, 45, 678]
}