package com.test

fun test() {
    val a: Int? = try {
//        parseInt(input)
        100
    } catch (e: NumberFormatException) {
        null
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}