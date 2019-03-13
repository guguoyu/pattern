package com.pattern.singleton.lazy.doublecheck;

public class LazyDoubleCheckSingleton {
    //私有化构造函数
    private LazyDoubleCheckSingleton() {

    }

    private static LazyDoubleCheckSingleton instance = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
