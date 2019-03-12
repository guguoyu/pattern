package com.pattern.singleton.hungry;

public class HungryStaticSingleton {

    private static HungryStaticSingleton instance;

    private HungryStaticSingleton(){}

    static {
        instance=new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance(){
        return instance;
    }
}
