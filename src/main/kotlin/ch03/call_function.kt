package ch03

import java.lang.StringBuilder

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3)
    println(list) // [1, 2, 3]

    println(joinToString(list, ";", "(", ")")) // (1;2;3)
    println(joinToString(list, " ")) // 1 2 3
    println(joinToString(list, ", ", prefix = "# ")) // # 1, 2, 3
}

fun <T> joinToString(list: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""): String {
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