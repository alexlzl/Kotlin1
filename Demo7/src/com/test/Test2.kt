package com.test

class PerSon(var name: String, var arg: Int) {
}

fun test(){
    val perSon = PerSon("a",100)
    println("person person name=${perSon.name} arg=${perSon.arg}")
}