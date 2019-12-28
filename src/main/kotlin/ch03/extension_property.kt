package ch03

import java.lang.StringBuilder

val String.lastCharacter: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this[length - 1] = value
    }

fun main(args: Array<String>) {
    println("ABC".lastCharacter) // C
    println("123".lastCharacter) // 3

    val sb = StringBuilder("123")
    println(sb.lastChar) // 3
    sb.lastChar = '4'
    println(sb.lastChar) // 4
}