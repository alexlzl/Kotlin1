package com.test

/**
 * Lambda 表达式俗称匿名函数，熟悉Java的大家应该也明白这是个什么概念。Kotlin 的 Lambda表达式更“纯粹”一点，
 * 因为它是真正把Lambda抽象为了一种类型，而 Java 8 的 Lambda 只是单方法匿名接口实现的语法糖罢了。
 */
val printMsg = { msg: String ->
    println(msg)
}

fun main(args: Array<String>) {
    printMsg.invoke("hello")
}