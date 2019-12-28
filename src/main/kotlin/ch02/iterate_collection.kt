package ch02

import java.util.*

fun main(args: Array<String>) {
    val map = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        map[c] = Integer.toBinaryString(c.toInt())
    }

    for ((c, binaryString) in map) {
        println("$c : $binaryString")
    }
    /*
    A : 1000001
    B : 1000010
    C : 1000011
    D : 1000100
    E : 1000101
    F : 1000110
     */

    val list = listOf("B", "A", "D")
    for ( (index, element) in list.withIndex()) {
        println("$index : $element")
    }
    /*
    0 : B
    1 : A
    2 : D
     */
}