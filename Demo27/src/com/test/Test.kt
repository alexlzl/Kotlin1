package com.test

class Test{

}

fun test(){
    val cla=Test::class
}

val String.lastChar: Char
    get() = this[length - 1]

fun main(args:Array<String>) {
    println(String::lastChar.get("abc"))
    println("alex".lastChar)
}