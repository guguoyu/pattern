package com.pattern.singleton.container;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        String name = ContainerSingleton.class.getName();
        System.out.println(name);
        Object instance = ContainerSingleton.getInstance(name);
        System.out.println(instance);
    }
}
