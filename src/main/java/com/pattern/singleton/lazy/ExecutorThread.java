package com.pattern.singleton.lazy;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleTon instance = LazySimpleSingleTon.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
