package com.test

//1，获取对应类型的，比如下面代码获取到 KProperty<Int>
var x = 1
fun main(args: Array<String>) {
    println(::x.get()) // prints "1"
    ::x.set(2)//KMutableProperty<Int>
    println(x)         // prints "2"
}
//2，获取 KClass
val c = MyClass::class

class MyClass{

}