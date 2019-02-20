package com.test

class Test5{

}
fun sum(vararg a:Int): Int {
    var sum=0
    for (i in a) {
        sum += i
    }
    return sum;
}
fun main(args:Array<String>){
   println( sum(1,2,3,4,6))
}

fun method(name: String?): Int? {
    if (name!=null){
        return name.toInt()
    }
    return null
}