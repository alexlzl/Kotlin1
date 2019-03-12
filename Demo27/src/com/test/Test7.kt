package com.test

import kotlin.reflect.KClass

class Foo
class Too{
    fun test(){
        println("test")
    }
}

fun function(factory: () -> Foo) {
    val x: Foo = factory()
}

fun main(args:Array<String>){
    function(::Foo)
    val c=Foo::class
   Too::test.invoke(Too())
}