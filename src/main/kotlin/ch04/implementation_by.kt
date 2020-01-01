package ch04

class CountableList<E>(val list: MutableList<E> = mutableListOf()): MutableList<E> by list {

    private var addCounter = 0

    override fun add(s: E): Boolean {
        addCounter ++
        println("add count : $addCounter")
        return list.add(s)
    }

}

class IntList(private val innerList: MutableList<Int> = mutableListOf()) : MutableList<Int> by innerList {
    override fun add(element: Int): Boolean {
        println("add : $element")
        return innerList.add(element)
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

    val intList = IntList()
    intList.add(1)
    intList.add(2)
}