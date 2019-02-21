package com.test

/**
 * 如果一个类定义有一个成员函数与一个扩展函数，而这两个函数又有相同的接收者类型、相同的名字，都适用给定的参数，这种情况总是取成员函数。 例如：
 */
class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo() {
    println("extension")
}

fun main(args: Array<String>) {
    //member
    CC().foo()
}