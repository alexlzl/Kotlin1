package com.test

  sealed class Time {

}

data class Time1(val number: Int) : Time() {
}

data class Time2(val number: Int, val name: String) : Time() {
}
//class Time3: Time() {}
fun main(args: Array<String>) {
    println(list(Time1(5)))
    println(list(Time2(8,"hehe")))
}

fun list(time:Time) : String = when(time){
    is Time1 -> "${time.number}"
    is Time2 -> time.name
}