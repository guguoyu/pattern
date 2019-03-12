package com.pattern.singleton.hungry;

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();
    //私有化构造函数
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
