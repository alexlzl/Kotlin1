package com.test

class NoField1 {
    var size = 1
    //isEmpty没有幕后字段
    var isEmpty = false
        get() = size == 0
        set(value) {
            size *= 2
            field=true
        }
}

fun main(args:Array<String>){
    var noField1=NoField1()
    noField1.isEmpty=true
    println(noField1.isEmpty)
    println(noField1.size)
}
