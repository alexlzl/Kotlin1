package com.test

/**
 * 函数作为参数
 */
class Hello {

    fun say() {
        print("Hello World")
    }

    /**
     * 在 Kotlin 中无返回为 Unit
     * 此方法接收一个无参数的函数并且无返回
     * 使用参数名加 () 来调用
     */
    fun people(hello: () -> Unit) {
        hello()
    }

    /**
     * 在 kotlin 中有一个约定，如果最后一个参数是函数，可以省略括号
     */
    fun main() {
        people({ say() })
        people { say() }

        val h = Hello()
        people(h::say) // 使用双冒号引用其他方法
    }
}

class Hello1 {

    fun say(msg: String): String {
        print("Hello $msg")
        return "alex"
    }

    /**
     * 参数中有函数
     */
    fun people(arg0: String, hello: (arg1: String) -> String) {
        hello(arg0)
    }



}
fun main(args:Array<String>) {
    val h = Hello1()
    Hello1(). people("Android", h::say) // 使用双冒号引用其他方法
}