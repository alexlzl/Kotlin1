package com.test

fun main(args: Array<String>) {
//    Test().stringRepresentation="name==="
//    println(Test().stringRepresentation)
//    Test1().setterVisibility="test"
//    println(setterVisibility)
}

class Test {
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            println(value+"add")
        }

}
class Test1{
    var setterVisibility: String = "abc"
        private set // 此 setter 是私有的并且有默认实现

}

class Test2{
    var setterVisibility: String = "abc"
        get // 此 setter 是私有的并且有默认实现

}
//var setterWithAnnotation: Any? = null
//    @Inject set // 用 Inject 注解此 setter