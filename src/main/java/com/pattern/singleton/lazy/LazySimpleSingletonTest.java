package com.pattern.singleton.lazy;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        new Thread(new ExecutorThread()).start();
        new Thread(new ExecutorThread()).start();
        System.out.println("123");
    }
}
