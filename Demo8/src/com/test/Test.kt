package com.test

class Greeter(name: String) {
    init {
        println("Hello, ${name}");
    }

    fun greet() {
        // name是无法访问的
//        println("Hello, ${name}");
    }
}

class Greeter1(val name1: String) {
    init {
        println("Hello, ${name1}");
    }
    fun greet() {
        println("Hello, ${name1}");
    }
}