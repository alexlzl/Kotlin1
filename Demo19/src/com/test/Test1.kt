package com.test

/**
 * 如果在默认参数之后的最后一个参数是 lambda 表达式
 * 那么它既可以作为命名参数在括号内传入，也可以在括号外传入：
 */
class Test1 {
    fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {}
    fun test() {
        foo(1) { println("hello") }
        foo(qux = { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1
        foo { println("hello") }        // 使用两个默认值 bar = 0 与 baz = 1
    }
//    foo(1) { println("hello") }     // 使用默认值 baz = 1
//    foo(qux = { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1


//    foo { println("hello") }        // 使用两个默认值 bar = 0 与 baz = 1

    fun reformat(str: String,
                 normalizeCase: Boolean = true,
                 upperCaseFirstLetter: Boolean = true,
                 divideByCamelHumps: Boolean = false,
                 wordSeparator: Char = ' ') {
    }
    fun test1(){
        reformat(str="")
    }

    fun foo(d:Char='a',a:Int,b:String,c:Boolean){}

    fun test2(){
        foo(b="alex",a=100,c=false)
    }

    fun test3(){
        val a = arrayOf(1, 2, 3)
//        val list = asList(-1, 0, *a, 4)
    }
}