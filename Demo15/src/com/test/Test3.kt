package com.test

/**
 * 由于 Meter 是内联类，所以上面的代码实际上并不会创建 Meter 类的实例，
 * 在运行时只是在操纵 double，但是却保证了井水不犯河水，Meter 和 Double 各不相干。
 * 你甚至可以用内联类定义一套计量单位。
 */
inline class Meter(val value: Double) {
    operator fun plus(m: Meter) = Meter(this.value + m.value)
}

fun test2() {
    var a = Meter(1.0)
    val b = Meter(2.0)
    val c = a + b // ok, c的类型为Meter
//    a = 3.0       // 编译错误：type mismatch
}