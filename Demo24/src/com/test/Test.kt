package com.test

/**
 * 当我们调用 callingFunction() ，只会打印”invoke lambda…”，
 * 说明 #1 、#3 的代码被跳过了，所以在使用inline函数中包含lambda静态式的时候，
 * 要避免在lambda中使用return ，应该使用return@higherOrderFunction的方式:
 * 使用return@higherOrderFunction的方式返回得到的结果正确。
 * 不过kotlin也有另一种方式来限制在lambda中直接return，那就是使用 noinline 或 crossinline 。
 */
inline fun higherOrderFunction( aLambda: () -> Unit) {
    aLambda()
    println("after invoke lambda") // 1
}

fun callingFunction() {
    higherOrderFunction {
        println("invoke lambda...") // 2
        return
    }
    println("after callingFunction...") // 3
}
