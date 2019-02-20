package com.test

fun main(args: Array<String>) {

    action(1){it-> //Lambda语法，回调参数在这里
        println("回调函数参数= : $it")

        true//Lambda语法，最后一行返回值就是闭包的返回值
    }
}

/**
 * 函数作为 形参
 */
fun action(first:Int, callback:(Int)->Boolean){

    //调用
    if(callback(1)){
        println("回调函数返回值 true")
    }else{
        println("回调函数返回值 false")
    }
}
