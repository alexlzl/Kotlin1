package com.test;

public class Test {
    public static void main(String[] args){
        Test voidDemo = new Test();
        Void v = voidDemo.voidDemo(); // Hello,Void
        System.out.println(v); // null
    }

    public Void voidDemo() {
        System.out.println("Hello,Void");
        return null;
    }


}
