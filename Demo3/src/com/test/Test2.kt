package com.test

/**
 * 延迟初始化      lateinit 只用于变量 var，而 lazy 只用于常量 val
 */
lateinit var name: String
//编译异常=========声明为lateinit的变量不能直接初始化
//lateinit var name1:String="alex"
//编译异常=========声明为lateinit的变量不能初始化为null
//lateinit var name2:String=null
/**
 * lateinit var只能用来修饰类属性，不能用来修饰局部变量，并且只能用来修饰对象，不能用来修饰基本类型(因为基本类型的属性在类加载后的准备阶段都会被初始化为默认值)。
  lateinit var的作用也比较简单，就是让编译期在检查时不要因为属性变量未被初始化而报错
 */
//lateinit var age1:Int
/**
 * by lazy本身是一种属性委托。属性委托的关键字是by
 */
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}
val age: Int by lazy {
    100
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
    print(name.length)
}