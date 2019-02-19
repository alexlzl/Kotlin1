package com.test

fun main(args:Array<String>){
    counter=-100
    println(counter)
    println(table.toString())
}
var counter = 0 // 注意：这个初始器直接为幕后字段赋值
    set(value) {
        field = if (value >= 0) {
            value
        }else{
            1001
        }
    }

private var tableN: Map<String, Int>? = null
 val table: Map<String, Int>
    get() {
        if (tableN == null) {
            tableN = HashMap() // 类型参数已推断出
        }
        return tableN ?: throw AssertionError("Set to null by another thread")
    }

val name:String
    get() = "alex"