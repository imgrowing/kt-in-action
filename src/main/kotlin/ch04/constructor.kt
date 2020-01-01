package ch04

open class Car constructor(val name: String) {

    var speed: Int = 0

    constructor(name: String, speed: Int): this(name) {
        this.speed = speed
    }
}

class ToyCar(name: String): Car(name)

fun main(args: Array<String>) {
    val car = Car("nice car")
    println(car.name) // ince car

    val toyCar = ToyCar("toy car")
    println(toyCar.name) // toy car
}

