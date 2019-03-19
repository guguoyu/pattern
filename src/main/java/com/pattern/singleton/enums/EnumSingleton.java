package com.pattern.singleton.enums;

public enum EnumSingleton {
    INSTANCE;
    //私有化构造函数
    private EnumSingleton(){
        System.out.println("新建对象");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
