package com.test


class Test5{
    val String.lastChar: Char
        get() = this[length - 1] //this:代表String对象,length 是 String内部的属性


}

fun main(args: Array<String>) {
    println(String::lastChar.get("abc")) // 输出 "c" ,和 调用一个类里面的属性的方法是一样的.
}