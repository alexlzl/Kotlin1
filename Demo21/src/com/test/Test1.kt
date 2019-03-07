package com.test

fun foo() {
    var a = 1

    fun child(){
        a++
        println(a)
    }
    child()
}

fun main(args: Array<String>) {
    foo()
    foo()
    foo()
}