package ch04

interface Clickable {
    fun click()  // abstract method
    fun showOff() = println("I'm clickable!") // default method
}

class Button: Clickable {  // implements Clickable
    override fun click() = println("I was clicked")
}

interface Focusable {
    fun showOff() = println("I'm focusable!")
}

class RadioButton : Clickable, Focusable {
    override fun click() = println("RadioButton was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        println("I'm RadioButton")
    }
}

fun main(args: Array<String>) {
    val button: Clickable = Button()
    button.showOff()
    button.click()

    println("===========")

    val radioButton = RadioButton()
    radioButton.showOff()
    radioButton.click()
}