package com.pattern.singleton.lazy.thread;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazyThreadSingleton instance = LazyThreadSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
