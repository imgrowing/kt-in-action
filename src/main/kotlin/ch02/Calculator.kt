package ch02

interface Expr {
    fun eval(): Int
}

class Num(val value: Int): Expr {
    override fun eval() = value
}

class Sum(val left: Expr, val right: Expr): Expr {
    override fun eval() = left.eval() + right.eval()

    override fun toString(): String {
        return this.eval().toString()
    }
}

fun main(args: Array<String>) {
    // 1 + 1 = 2
    println(Sum(Num(1), Num(1)))
    // (1 + 2) + 3 = 6
    println(Sum(Sum(Num(1), Num(2)), Num(3)))
}