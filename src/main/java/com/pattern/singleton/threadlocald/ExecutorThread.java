package com.pattern.singleton.threadlocald;

public class ExecutorThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());

    }
}
