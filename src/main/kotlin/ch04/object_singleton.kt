package ch04

object AddCounter {
    var count: Int = 0

    fun increace() = count ++
}

object StringLengthComparator : Comparator<String> {
    override fun compare(s1: String, s2: String): Int =
        when {
            s1.length < s2.length -> -1
            s1.length > s2.length -> 1
            else -> 0
        }
}

object NumLengthComparator

fun main(args: Array<String>) {
    println(AddCounter.count) // 0
    AddCounter.increace()
    println(AddCounter.count) // 1

    val list = listOf("ABCD", "A", "AB", "ABC")
    println(list.sortedWith(StringLengthComparator)) // [A, AB, ABC, ABCD]
}