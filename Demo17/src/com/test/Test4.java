package com.test;

public final class Test4 {
    private static int code;
    public static final Test4 INSTANCE;

    public final int getCode() {
        System.out.println(code);
        return code;
    }

    public final void setCode(int var1) {
        code = var1;
    }

    public final void getData() {
    }

    static {
        Test4 var0 = new Test4();
        INSTANCE = var0;
        code = 1;
    }
}

