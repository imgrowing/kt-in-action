package ch03

fun main(args: Array<String>) {
    val art =
        """|  //
          .| //
          .|/ \"""
    println(art.trimMargin("."))

    val name = "world"
    println("""hello $name""")

    println("""price: $123""")

    val price = 123
    println("""price: $${price}""")
}