package com.test

/**
 * 类属性的访问
 */
class Test_A(var pre: Int)
fun main(args:Array<String>){
    //调用
    var kpreperty=Test_A::pre
   println( kpreperty.get(Test_A(10)))
}