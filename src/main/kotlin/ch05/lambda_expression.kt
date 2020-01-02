package ch05

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(
        Person("name14", 14),
        Person("name7", 7),
        Person("name22", 22),
        Person("name15", 15)
    )

    // Iterable<T>.maxBy( (T) -> R )
    var person = people.maxBy({ p: Person -> p.age }) // maxBy는 함수를 인자로 받는다.
    println(person) // Person(name=name22, age=22)

    person = people.maxBy() { p: Person -> p.age } // 마지막 인자가 람다식인 경우에는 괄호 바깥으로 빼낼 수 있다.
    println(person)

    person = people.maxBy { p: Person -> p.age } // 람다식을 괄호 바깥으로 빼낸 후 빈 괄호는 생략할 수 있다.
    println(person)

    person = people.maxBy { p -> p.age } // 람다식의 파라미터 타입을 추론할 수 있는 문맥 정보가 있다면 타입을 생략할 수 있다.
    println(person)

    person = people.maxBy { it.age } // 람다식의 유일한 파라미터인 경우, 파라미터를 생략하면 자동으로 생성되는 it 파라미터를 사용할 수 있다.
    println(person)

}