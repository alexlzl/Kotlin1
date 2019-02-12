package com.test

fun main(args: Array<String>) {
    test2()
}

fun test1() {
    for (x in 1..10 step 2) {
        println(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

fun test2() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}