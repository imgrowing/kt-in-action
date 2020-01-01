package ch04

class CountableList<E>(val list: MutableList<E> = mutableListOf()): MutableList<E> by list {

    private var addCounter = 0

    override fun add(s: E): Boolean {
        addCounter ++
        println("add count : $addCounter")
        return list.add(s)
    }

}

fun main(args: Array<String>) {
    val countableList = CountableList<String>()
    countableList.add("a")
    countableList.add("b")
    countableList.add("c")
    println(countableList.list)

    /*
    add count : 1
    add count : 2
    add count : 3
    [a, b, c]
     */
}