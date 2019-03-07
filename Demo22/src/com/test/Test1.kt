package com.test

class Test1 {
    // f 是扩展函数
    fun my( f : String.(Int)->Unit ) {
        "abc".f(1)   //
        f("abc",1)   //和上一句的效果相同
    }

    val f1 = { a1: String, a2: Int ->
        //
        Unit     //返回Unit
    }
//    my( f1 )  // OK, f1的类型为  （String,Int)-Unit , 与 String.(Int)->Unit 是等价的
}