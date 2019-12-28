package ch03

fun main(args: Array<String>) {
    val hashSet = hashSetOf(1, 2)
    println(hashSet.javaClass) // java.util.HashSet

    val set = setOf(1, 2)
    println(set.javaClass) // java.util.LinkedHashSet

    val arrayList = arrayListOf(1, 2)
    println(arrayList.javaClass) // java.util.ArrayList

    val list = listOf(1, 2)
    println(list.javaClass) // java.util.Arrays$ArrayList

    val mutableList = mutableListOf(1, 2)
    println(mutableList.javaClass) // java.util.ArrayList

    val hashMap = hashMapOf(1 to "one", 2 to "two")
    println(hashMap.javaClass) // java.util.HashMap

    val map = mapOf(1 to "one", 2 to "two")
    println(map.javaClass) // java.util.LinkedHashMap

    val mutableMap = mutableMapOf(1 to "one", 2 to "two")
    println(mutableMap.javaClass) // java.util.LinkedHashMap
}