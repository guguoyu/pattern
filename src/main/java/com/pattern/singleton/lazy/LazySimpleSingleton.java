package com.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
