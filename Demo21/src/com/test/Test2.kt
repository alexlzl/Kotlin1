package com.test

/**
 * 函数里面声明函数，函数里面返回函数，就是闭包

1.函数内部的局部变量的状态保存住了 （变量的值就是状态）

2.a 被隐藏起来了，但我们调用函数可以改变状态，或者获得a的值，这点就是函数的面向对象，让函数具有封装的能力，让函数既有了状态。
 */
fun test(): () -> Unit {
    var a = 3 //状态
    return fun() {
        a++
        println(a)
    }
}

fun main(args: Array<String>) {
    var t = test()
    t()
    t()
    t()
//    test()
}