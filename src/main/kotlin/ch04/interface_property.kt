package ch04

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String): User

class SubscribingUser(val email: String): User {
    override val nickname: String
        get() = email.substringBefore("@")  // custom getter만 제공
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)  // 프로퍼티 초기화

    private fun getFacebookName(accountId: Int) = "facebookName$accountId"
}

fun main(args: Array<String>) {
    println(PrivateUser("gildong").nickname)
    println(SubscribingUser("gildong@email.com").nickname)
    println(FacebookUser(123).nickname)
}