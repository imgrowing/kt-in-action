package ch04.companionobj

class User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        return "faceNick$facebookAccountId"
    }
}

class CompanionUser {
    val nickname: String

    private constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    private constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        return "faceNick$facebookAccountId"
    }

    companion object {
        fun newEmailUser(email: String) = CompanionUser(email)
        fun newFacebookUser(facebookAccountId: Int) = CompanionUser(facebookAccountId)
    }
}

fun main(args: Array<String>) {
    val emailUser = User("asdf@email.com")
    println(emailUser.nickname) // asdf
    val facebookUser = User(123)
    println(facebookUser.nickname) // faceNick123

    val emailUser2 = CompanionUser.newEmailUser("qwer@email.com")
    println(emailUser2.nickname) // qwer
    val facebookUser2 = CompanionUser.newFacebookUser(456)
    println(facebookUser2.nickname) // faceNick456
}

