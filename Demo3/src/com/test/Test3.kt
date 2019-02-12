package com.test

fun main(args: Array<String>) {
//    foo(1)
    test()
}

/**
 * if 表达式，可返回值
 */
fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    print(result)
}

/**
 * when 表达式，可返回值
 */
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

/**
 * try catch表达式返回值
 */
fun test() {
    val result = try {
        "test"
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }

    // 使用 result
    println(result)
}

/**
 * 单表达式函数
 */
fun theAnswer() = 42
//等价下面函数
//fun theAnswer(): Int {
//    return 42
//}
//单表达式函数与其它惯用法一起使用能简化代码，例如和 when 表达式一起使用
fun transform1(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}