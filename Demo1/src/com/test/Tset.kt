package com.test

class Triangle {}

class Rectangle {}

fun main(args: Array<String>) {
    val tr = Triangle()
    val rect = tr.let { it ->
        println("It is $it")
        return@let Rectangle()
    }
    println(rect)
}

