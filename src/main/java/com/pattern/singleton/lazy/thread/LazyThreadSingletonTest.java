package com.pattern.singleton.lazy.thread;

public class LazyThreadSingletonTest {

    public static void main(String[] args) {
        new Thread(new ExecutorThread()).start();
        new Thread(new ExecutorThread()).start();
        System.out.println("两次线程运行结束");
    }
}
