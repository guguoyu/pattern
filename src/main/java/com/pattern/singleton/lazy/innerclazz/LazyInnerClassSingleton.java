package com.pattern.singleton.lazy.innerclazz;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {

    }

    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.lazy;
    }

    //默认不加载
    private static class LazyHolder {
        private static LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}


