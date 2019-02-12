package com.test

/**
 * 延迟初始化
 */
lateinit var  name:String
//编译异常=========声明为lateinit的变量不能直接初始化
//lateinit var name1:String="alex"
//编译异常=========声明为lateinit的变量不能初始化为null
//lateinit var name2:String=null
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}