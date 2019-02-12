package com.test

/**
 * 对一个对象实例调用多个方法 （with）
 */
fun main(args :Array<String>){
    class Turtle {
        fun penDown(){
            println("penDown")
        }
        fun penUp(){
            println("penUp")
        }
        fun turn(degrees: Double){
            println(degrees)
        }
        fun forward(pixels: Double){
            println(pixels)
        }
    }

    val myTurtle = Turtle()
    with(myTurtle) { // 画一个 100 像素的正方形
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}