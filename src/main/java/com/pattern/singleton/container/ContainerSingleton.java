package com.pattern.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    //私有化构造函数
    private ContainerSingleton() { }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    //反射创建对象
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
