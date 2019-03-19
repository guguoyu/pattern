package com.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;
    //私有化构造函数
    private LazySimpleSingleton() { }

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
