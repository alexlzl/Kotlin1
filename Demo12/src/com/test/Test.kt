package com.test

/**
 * 扩展属性
 * 注意：由于扩展没有实际的将成员插入类中，因此对扩展属性来说幕后字段是无效的。
 * 这就是为什么扩展属性不能有初始化器。他们的行为只能由显式提供的 getters/setters 定义。
 */
//val Foo.bar = 1 // 错误：扩展属性不能有初始化器
val <T> List<T>.lastIndexx: Int
    get() = size - 1

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c", "d")
    println(list.lastIndexx)
}