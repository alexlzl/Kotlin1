package com.test


interface Base {
    fun print()
}
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}
class Derived(b: Base) : Base by b{
    fun test(){
        print("ttt")
    }
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}