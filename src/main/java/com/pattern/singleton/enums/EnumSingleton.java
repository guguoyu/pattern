package com.pattern.singleton.enums;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton(){
        System.out.println("新建对象");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
