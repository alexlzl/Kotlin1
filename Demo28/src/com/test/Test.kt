package com.test

class Foo{
    //factory: () -> Foo 代表Foo类的构造函数
    fun function(factory: () -> Foo) {
        val x: Foo = factory()
    }

    fun test(){

    }

    fun main(args:Array<String>){
        //::Foo 代表类Foo的构造函数引用
        function(::Foo)
        val f=Foo::test
    }
}

