package com.test

class Test {
     var name="alex"
}

fun main(args: Array<String>) {
//    test()
    repeat(10, { println("Hello") })

}

fun test() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad

   var test:Test= with(Test()){
        name="alex-new"
       this
    }
    println((test as Test).name)
    Test().run {

    }

    repeat(10, { println("Hello") })
}


