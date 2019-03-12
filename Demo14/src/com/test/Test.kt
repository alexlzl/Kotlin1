package com.test

open class Test<T>(t:T){
    open var n=t
}

class Child :Test<Child>(Child()){
    override var n= Child()
    fun test(){
        println(n)
    }
}