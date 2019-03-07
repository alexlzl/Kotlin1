package com.test

/**
 * 闭包=====================
 *从本质上说： 闭包 == 函数 == Java Lambda 表达式 == Java 只有一个方法的类或接口
 *
 * Kotlin支持函数中定义函数，内部函数可以访问外部函数的变量。
 * 局部函数有什么用？实现闭包
 *
 * 什么是闭包：函数内包含子函数，并最终return子函数。
 *
 * 闭包作用
 * 让函数成为编程语言中的一等公民
让函数具有对象所有的能力（封装）
让函数具有状态
 */
fun test(): () -> Unit {
    var a = 3 //状态
    return fun() {
        a++
        println(a)
    }
}

/**
 * 输出===========4,5,6
 */
fun main(args: Array<String>) {
    var t = test()
    t()
    t()
    t()
}