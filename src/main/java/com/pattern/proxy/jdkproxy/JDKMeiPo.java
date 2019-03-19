package com.pattern.proxy.jdkproxy;

import com.pattern.proxy.staticd.Object;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler {

    private Object target;

    public java.lang.Object getInstance(Object person){
        this.target=person;
        Class<? extends Object> clazz = target.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        return Proxy.newProxyInstance(classLoader,clazz.getInterfaces(),this);
    }


    @Override
    public java.lang.Object invoke(java.lang.Object o, Method method, java.lang.Object[] objects) throws Throwable {
        before();
        java.lang.Object obj = method.invoke(this.target,objects);
        after();
        return obj;
    }

    private void after() {
        System.out.println("如果合适的话，准备办事");
    }

    private void before() {
        System.out.println("媒婆：现在要拿去你的需求给你介绍对象");
    }
}
