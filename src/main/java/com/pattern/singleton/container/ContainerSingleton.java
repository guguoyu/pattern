package com.pattern.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    Object o = Class.forName(className).newInstance();
                    ioc.put(className, o);
                    return o;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }


    }
}
