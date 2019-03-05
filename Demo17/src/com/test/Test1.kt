package com.test

class Test1{
    fun main(args: Array<String>) {
        val numberList = listOf(1, 3, 5, 7, 9, 11, 13)
        println(numberList.joinToStr("<",",",">"))
        //这段代码在调用者看来就仅仅是传入三个字符串，给人看起来很迷惑，根本就不知道每个字符串实参到底代表是什么意思。
        //这里代码是很脆弱的，在不看函数声明时，字符串要么很容易被打乱顺序，要么没人敢改这里的代码了。
    }

    fun <T> Iterable<T>.joinToStr(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = ""): String{
        return this.joinToString(separator, prefix, postfix)
    }


}