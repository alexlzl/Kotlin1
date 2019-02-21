package com.test

/**
 * 我们想强调的是扩展函数是静态分发的，即他们不是根据接收者类型的虚方法。
 * 这意味着调用的扩展函数是由函数调用所在的表达式的类型来决定的， 而不是由表达式运行时求值结果决定的。例如：
 * 这个例子会输出 "c"，因为调用的扩展函数只取决于参数 c 的声明类型，该类型是 C 类
 */
open class C1

class D1 : C1()

fun C1.foo() = "c"

fun D1.foo() = "d"

fun printFoo(c: C1) {
    println(c.foo())
}

fun main(args: Array<String>) {
    printFoo(D1())
}
//printFoo(D1())