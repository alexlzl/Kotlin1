package com.test

inline class Duck(val name: String) {
    constructor() : this("ywwuyi")

    fun talk(): Nothing = throw UnsupportedOperationException()

    var i: Int
        get() = 1551
        set(value) = println(value)

    companion object { /* ... */ }
}

fun test() {
    val duck = Duck("ywwuyi")
    println(duck.name)
    println(duck.i)
    duck.i = 6655
    duck.talk()
}

fun main(args:Array<String>){

}