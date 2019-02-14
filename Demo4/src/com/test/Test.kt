package com.test

fun main(args: Array<String>) {
//    test1()
//    test2()
//    test3()
//    test4()
//    test5()
    test6()
}

/**
 * 在数字范围内存在缓存池
 */
fun test1() {
    val a: Int = 10
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“true”！！！
}

fun test2() {
    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
}

fun test3() {
    val array = arrayOf(100, 2, 's', "ss")
    println(array[3])
}

fun test4() {
    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}

fun test5() {
    val s = "Hello,\n world!\n"
    println(s)
    //原始字符串 使用三个引号（"""）分界符括起来，内部没有转义并且可以包含换行以及任何其他字符
    val s1 = """Hello,\n world!\n"""
    println(s1)
}

fun test6() {
    val text1 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
    println(text1)
    /**
     * 你可以通过 trimMargin() 函数去除前导空格：
     * 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
     */
    val text = """
    >Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin(">")
    println(text)
}