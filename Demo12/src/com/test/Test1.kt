package com.test

/**
 * 如果一个类定义有一个伴生对象 ，你也可以为伴生对象定义扩展函数与属性：
 */
class MyClass {
    companion object { }  // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {

}