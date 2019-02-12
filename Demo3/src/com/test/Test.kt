package com.test

val student:Student?=null
var studentr:Student?=null
fun main(args: Array<String>) {
//    print(test1(3, 2))
//    print(test2(3, 2))
    printProduct("5","6")
}

fun test1(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
    val n= when(a>b){
        true -> print(a)
        false ->  print(b)
    }
    return  when(a>b){
        true -> return a
        false -> b
    }
}
fun test2(a: Int, b: Int) = if (a > b) a else b

fun test3() {
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}

fun printProduct(arg1: String, arg2: String) {
    var x = parseInt(arg1)
    var y = parseInt(arg2)

    // 直接使用 `x * y` 会导致编译错误，因为他们可能为 null
    if(x!=null&&y!=null){
        println(x * y)
    }
    var student1:Student?=null
    if(student1!=null){
        print(student1.name)
    }
    if(student!=null){
        print(student.name)
    }
    //全局变量，if(studentr!=null) 不能保证后面执行的代码studentr 不为空
//    if(studentr!=null){
//        print(studentr.name)
//    }
//    if (x != null && y != null) {
//        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
//        println(x * y)
//    }
//    else {
//        println("either '$arg1' or '$arg2' is not a number")
//    }
}
fun parseInt(str: String): Int? {
    return  Integer.parseInt(str)
}