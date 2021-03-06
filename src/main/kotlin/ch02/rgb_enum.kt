package ch02

import java.lang.Exception

// enum 클래스 정의
enum class Color(
    val r: Int,
    val g: Int,
    val b: Int) {

    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 255),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

// 여러 개의 조건을 하나로 지정할 때는 콤마를 사용하여 연결한다.
fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
        Color.GREEN, Color.BLUE -> "natural"
        Color.INDIGO, Color.VIOLET -> "cold"
    }

// 혼합했을 때이 색상을 구하는 함수
// RED + YELLOW => ORANGE
// YELLOW + BLUE => GREEN
// BLUE + VIOLET => INDIGO
// etc => throw exception: Dirty Color
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }


fun main(args: Array<String>) {
    println(Color.BLUE.rgb()) // 255

    println(getMnemonic(Color.BLUE)) // Battle

    println(getWarmth(Color.ORANGE)) // Warm

    println(mix(Color.YELLOW, Color.BLUE))  // GREEN
    try {
        println(mix(Color.RED, Color.BLUE)) // Exception: Dirty Color
    } catch (e: Exception) { println(e) }

}