package com.test

class Person {
    /**
     * 可以看到给一个给一个属性赋值时，确实是执行了写访问器setter, 但是为什么结果还是默认值Paul呢？因为我们重写了setter，却没有给属性赋值，当然还是默认值
     */
    var name: String = "Paul"
        set(valueP) {
            println("执行了写访问器，参数为：$valueP")
        }
}

//测试
fun main(args: Array<String>) {
    var person = Person()
    // 写name属性
    person.name = "hi,this is new value"
    println("打印结果:${person.name}")
}
