package com.test

fun main(args: Array<String>) {

    //lambda 闭包写在函数体外部， 形参中的最后一个形参是函数参数  可以这么写
    action1(2){
        println("函数 回调 -- 第1种传递写法")
    }

    //lambda 闭包作为形参
    action1(1,{
        println("函数 回调 -- 第2种传递写法")
    })


    //一步步的 显示调用方式
    var method1:()->Unit = {
        println("函数 回调 -- 第3种传递写法")
    }
    action1(3, method1)
}

/**
 * 函数作为 形参
 */
fun action1(first:Int, callback:()->Unit){

    //调用
    callback()
}
