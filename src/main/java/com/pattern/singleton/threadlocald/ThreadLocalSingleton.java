package com.pattern.singleton.threadlocald;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){

    }

    private static ThreadLocal<ThreadLocalSingleton> threadLocal= new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
