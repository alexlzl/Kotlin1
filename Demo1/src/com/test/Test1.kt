package com.test

/**
 * 1% 2 == 0 => null
2% 2 == 0 => 2
3% 2 == 0 => null
 */
fun main(args: Array<String>) {
    val arr = listOf(1, 2, 3)
    arr.forEach {
        println("$it% 2 == 0 => ${it.takeIf { it % 2 == 0 }}")
    }
}