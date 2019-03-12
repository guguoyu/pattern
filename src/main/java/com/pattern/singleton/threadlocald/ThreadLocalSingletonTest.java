package com.pattern.singleton.threadlocald;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());

        new Thread(new ExecutorThread()).start();
        new Thread(new ExecutorThread()).start();

    }
}
