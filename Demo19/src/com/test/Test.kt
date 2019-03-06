package com.test

/***
 * 覆盖方法总是使用与基类型方法相同的默认参数值。
 * 当覆盖一个带有默认参数值的方法时，必须从签名中省略默认参数值：
 */
open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {}  // 不能有默认值
}

fun foo(bar: Int = 0, baz: Int) {  }

fun foo1(a:Int=100,b:String){}

fun test(){
    foo(bar=100,baz = 1) // 使用默认值 bar = 0
    foo(100,1)
    foo1(b="alex")
}