package com.test

class NoField {
    var size = 0
    //isEmpty没有幕后字段
    var isEmpty
        get() = size == 0
        set(value) {
            size *= 2
        }
}

// 例子一
class Person1 {
    var name:String = "default"
        get() = field+"alex"
        set(value) {
            field = value+"test"
        }
}

fun main(args:Array<String>){
   var person1= Person1()
    person1.name="aaaa"
    println(person1.name)
}

class Person2 {
    //错误的演示
    var name = ""
        set(value) {
            field = value
        }
}

