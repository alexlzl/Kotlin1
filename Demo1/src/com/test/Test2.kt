package com.test

fun main(args: Array<String>) {
    val arr = listOf(1, 2, 3)
    arr.forEach {
        println("$it % 2 == 0 => ${it.takeUnless { it % 2 == 0 }}")
    }
}

