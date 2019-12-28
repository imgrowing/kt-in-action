package ch03

import java.lang.StringBuilder

fun String.lastChar() = this[this.length - 1]

fun main(args: Array<String>) {
    println("Hello".lastChar()) // o
    println("ABC".lastChar())   // C

    println(listOf(1, 2, 3).joinToString()) // 1, 2, 3
    println(listOf(1, 2, 3).joinToString("; ", "[", "]")) // [1; 2; 3]
    println(setOf("A", "B", "C").joinToString()) // A, B, C
}

fun <T> Collection<T>.joinToString(
    list: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val stringBuilder = StringBuilder(prefix)

    for ((index, e) in list.withIndex()) {
        if (index > 0) {
            stringBuilder.append(separator)
        }

        stringBuilder.append(e)
    }
    stringBuilder.append(postfix)
    return stringBuilder.toString()
}