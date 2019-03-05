package com.test

fun main(args: Array<String>) {
    val numberList = listOf(1, 3, 5, 7, 9, 11, 13)
    println(numberList.joinToStr(Speparator(","), Prefix("<"), Postfix(">")))
}

/**
 * 看到这里是不是很多人觉得这样实现有问题，虽然它能很好解决我们上述类型不明确的问题。
 * 但是却引入一个更大问题，需要额外创建Speparator、Prefix、Postfix实例对象，带来很多的内存开销。
 * 从投入产出比来看，估计没人这么玩吧。
 * 这是因为inline class没出来之前，但是如果inline class能把性能开销降低到和直接使用String一样的性能开销，
 * 你还认为它是很差的方案吗? 请接着往下看
 */
//相比上一个方案，仅仅是多加了inline关键字
inline class Speparator(val separator: CharSequence)

inline class Prefix(val prefix: CharSequence)
inline class Postfix(val postfix: CharSequence)


fun <T> Iterable<T>.joinToStr(
        separator: Speparator,
        prefix: Prefix,
        postfix: Postfix
): String {
    return this.joinToString(separator.separator, prefix.prefix, postfix.postfix)
}
