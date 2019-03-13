package com.pattern.singleton.lazy.thread;

public class LazyThreadSingleton {

    private static LazyThreadSingleton lazySingleTon = null;
    //私有化构造函数
    private LazyThreadSingleton() {

    }

    public static synchronized LazyThreadSingleton getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazyThreadSingleton();
        }
        return lazySingleTon;
    }
}
