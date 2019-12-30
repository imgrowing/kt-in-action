package ch04.backingfield

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("update address : $field -> $value")
            field = value
        }
        get() {
            println("get address")
            return field
        }
}

fun main(args: Array<String>) {
    val user = User("tom")
    println(user.address)
    user.address = "서울시 강동구 천호동 111"
    println(user.address)
    user.address = "서울시 강남구 삼성동 222"
    println(user.address)
}