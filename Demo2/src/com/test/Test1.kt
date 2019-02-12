package com.test

class Test1{
    private var name="alex"


     fun test(){
    }
    companion object {
        var b="abc"
        var obj:Test?=null
        /** 我是main入口函数 **/
        @JvmStatic
        fun main(args: Array<String>) {
            if ( obj?.str!=null) {
                print("String of length ")
            } else {
                print("Empty string")
            }
        }
    }

}