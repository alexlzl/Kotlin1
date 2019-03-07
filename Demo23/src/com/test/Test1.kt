package com.test

inline fun foo(fun1:(String)->String,fun2:(Int,Int)->Int){
    var name="alex"
    println(fun1("=="))
    println(fun2(101,101))
}




fun main(args:Array<String>){
    var m={name:String-> "alex$name" }
    var n={a:Int,b:Int->100}
    foo(m) { a:Int, b:Int->100+a+b}
    foo(m,n)
}