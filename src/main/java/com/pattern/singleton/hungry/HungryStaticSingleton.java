package com.pattern.singleton.hungry;

public class HungryStaticSingleton {

    //私有化构造函数
    private HungryStaticSingleton() {
    }

    private static HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance() {
        return instance;
    }
}
