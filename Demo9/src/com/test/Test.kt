package com.test

class Test {
    val currentTimeMillis: Long
        get() {
            return System.currentTimeMillis()
        }
}

fun main(args:Array<String>){
  println(  Test().currentTimeMillis)
}