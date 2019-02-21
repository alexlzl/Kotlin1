package com.test

interface MyInterface {
    //编译异常，不允许在接口汇总初始化变量
//     val tt="alex"
//    var t="alex"
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }

    fun test()
}

class Child : MyInterface {
    override fun test() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val prop: Int = 29
}