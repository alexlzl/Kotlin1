package com.test

//在Kotlin接口中定义
interface Foo {
    companion object {
        @JvmField
        val answer: Int = 42

        @JvmStatic
        fun sayHello() {
            println("Hello, world!")
        }
    }
}

class Test3{
    @JvmField
    var name:String?=null
}
      fun main(args:Array<String>){
          System.out.println("Foo test: " + Foo.answer + " say: " + Foo.sayHello())
      }
//在Java代码中调用
//class TestFoo {
//    public static void main(String[] args){
//        System.out.println("Foo test: " + Foo.answer + " say: " + Foo.sayHello());
//    }
//}

