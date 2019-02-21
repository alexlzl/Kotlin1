package com.test

class C1 {
    var age=100
    fun D.foo() {
        toString()         // 调用 D.toString()
        this@C1.toString()  // 调用 C.toString()
    }

    fun test(){
        D().foo()
    }
}

class D{
    var name="alex"
}

fun main(args:Array<String>){

}