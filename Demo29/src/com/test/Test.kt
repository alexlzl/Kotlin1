package com.test

import kotlin.reflect.KClass

class Test{
    fun test(){
        Foo().foo(Test::class.java)
    }

    fun test1(){
        test2(Test::class)
    }
}

fun test2(clazz: KClass<Test>){

}