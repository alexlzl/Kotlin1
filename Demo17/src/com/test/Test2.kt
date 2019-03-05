package com.test

/**
 * https://juejin.im/post/5c0558fa51882545e24edead
 */
typealias Token = String

inline class TokenWrapper(val value: String)

fun main(args: Array<String>) {
    val token: Token = "r3huae03zdhreol38fdjhkdfd8df"//可以看出这里Token名称完全是当做String类型来用了，相当于给String取了一个有意义的名字
    val tokenWrapper = TokenWrapper("r3huae03zdhreol38fdjhkdfd8df")//而inline class则是把String类型的值包裹起来，相当于String的一个包装器类。

    println("token is $token")
    println("token value is ${tokenWrapper.value}")//这里tokenWrapper并不能像token一样当做String来使用，而是需要打开包装器取里面value值
}

