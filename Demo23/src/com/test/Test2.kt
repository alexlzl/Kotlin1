package com.test

/**
 * 通过将innerFun的lambda参数标记为crossinline后，return操作将不被允许；
 */
fun outterFun() {
    innerFun {
        return  //支持直接返回outterFun
        // return@innerFun 1 //如果要返回lambda，则必须有返回值
    }
}

inline fun innerFun(a: () -> Int) {}
interface TestInterface {
    fun test(a: Int): Int
}

inline fun testInterface(crossinline t: (Int) -> Int): TestInterface = object : TestInterface {
    override fun test(a: Int): Int = t.invoke(a)
}


fun test1() {
    //调用testInterface
    testInterface {
        1
    }

//    testInterface{
//    return //错误
//}
}


////虽然testInterface方法是inline的，但是此处禁止直接return，因为其lambda参数使用了crossinline标记：
//testInterface{
//    return //错误
//}
