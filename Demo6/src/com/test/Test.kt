package com.test

/**
 * 已知值的属性可以使用 const 修饰符标记为 编译期常量。 这些属性需要满足以下要求：
位于顶层或者是 object 声明 或 companion object 的一个成员
以 String 或原生类型值初始化
没有自定义 getter
这些属性可以用在注解中：
 */
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

class Test {
//    const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
}

class Person {
    var name:String = "Paul"
        get() = "i am getter,name is Jake"
}
//测试
fun main(args: Array<String>) {
    var person = Person()
    // 读name属性
    val name = person.name
    println("打印结果:$name")
}

