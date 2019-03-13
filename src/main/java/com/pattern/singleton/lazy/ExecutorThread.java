package com.pattern.singleton.lazy;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        //获取实例
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        //打印当前线程名和实例名
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
