package ch04

fun main(args: Array<String>) {
    val list = listOf("*", "***", "****", "**")
    val sortedList = list.sortedWith(
        object : Comparator<String> {
            override fun compare(s1: String, s2: String): Int =
                when {
                    s1.length < s2.length -> -1
                    s1.length > s2.length -> 1
                    else -> 0
                }
        }
    )

    println(sortedList) // [*, **, ***, ****]
}




