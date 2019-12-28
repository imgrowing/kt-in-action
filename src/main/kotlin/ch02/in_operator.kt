package ch02

fun main(args: Array<String>) {
    println(3 in 1..4) // true
    println(4 in 1..4) // true
    println(4 in 1..3) // false
    println('b' in 'a'..'c') // true
    println('d' in 'a'..'c') // false

    println(3 !in 1..4) // false
    println(4 !in 1..4) // false
    println(4 !in 1..3) // true
    println('b' !in 'a'..'c') // false
    println('d' !in 'a'..'c') // true
}