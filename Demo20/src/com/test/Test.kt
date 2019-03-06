package com.test

/**
 * 尾递归优化
 *
 * 要知道，手动尾递归优化成功的必要条件是：
使用 tailrec 标明函数为尾递归
在函数最后进行递归调用
这个“最后”并不仅仅指最后一条语句，而是特别要求执行顺序的最后。
 */
fun main(args: Array<String>) {
    testFactorial("原始阶乘函数", ::normalFactorial)
    testFactorial("失败的尾递归优化", ::tailFactorial)
    testFactorial("正确的尾递归优化", ::factorial)
}

fun testFactorial(caseName: String, func: (Long) -> Long, times: Int = 10000, input: Long = 10000): Unit {
    val start = System.currentTimeMillis()
    for (i in 1..times) {
        func(10000)
    }
    val end = System.currentTimeMillis()
    val cost = end - start
    println("$caseName 用时：$cost")
}

/**
 * 原始阶乘函数
 */
fun normalFactorial(n: Long): Long {
    return if (n <= 1) {
        n
    } else {
        normalFactorial(n - 1) * n
    }
}

/**
 * 失败的尾递归优化 这是因为，函数最后一条语句执行时，要先计算 factorial(n - 1)，再将计算结果和 n 相乘，最后得出返回值，所以尾递归优化失败了。
 */
tailrec fun tailFactorial(n: Long): Long {
    return if (n <= 1) {
        n
    } else {
        tailFactorial(n - 1) * n
    }
}

/**
 * 尾递归优化
 */
fun factorial(n: Long): Long {
    return fact(n)
}

tailrec fun fact(num: Long, accum: Long = 1): Long {
    val soFar = num * accum
    return if (num <= 1) {
        soFar
    } else {
        fact(num - 1, soFar)
    }
}