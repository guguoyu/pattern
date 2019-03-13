package com.pattern.singleton.lazy.innerclazz;

public class LazyInnerClassSingleton {
    //私有化构造函数
    private LazyInnerClassSingleton() {

    }

    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.lazy;
    }

    //内部类，默认不加载
    private static class LazyHolder {
        private static LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}


