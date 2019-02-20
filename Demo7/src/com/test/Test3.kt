package com.test

class Test3(var name:String,age :Int){
    init {
        println("$name===$age")
    }
}

fun main(args:Array<String>){
    Test3("alex",100)
}

class Foo(){
    constructor(age: Int):this(){

    }
}

fun print(str1: String="age", str2: String, str3: String = "kotlin"){
    println("$str1 $str2 $str3")
}