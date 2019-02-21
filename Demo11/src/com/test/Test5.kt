package com.test

class C2 {
    fun foo() { println("member") }
}

fun C2.foo(i: Int) { println("extension") }

fun main(args:Array<String>){
    C2().foo(100)
}