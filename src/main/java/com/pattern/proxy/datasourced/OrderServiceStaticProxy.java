package com.pattern.proxy.datasourced;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements InvocationHandler {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private Object target;



    public  Object getInstance(Object target) {
        this.target=target;
        Class<?> clazz = target.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        return Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), this);
    }

    @Override
    public java.lang.Object invoke(java.lang.Object o, Method method, java.lang.Object[] objects) throws Throwable {
        before(objects[0]);
        java.lang.Object obj = method.invoke(this.target, objects);
        after();
        return obj;
    }


    private void after() {
        System.out.println("proxy after method");
    }

    private void before(java.lang.Object target) {
        System.out.println("proxy before method");
        Class<?> clazz = target.getClass();
        try {
            Method method = clazz.getMethod("getCreateTime");
            Long createTime = (Long) method.invoke(target);
            Integer format = Integer.valueOf(sdf.format(new Date(createTime)));
            System.out.println("静态代理类自动分配到" + format + "数据源处理了数据");
            DynamicDataSourceEntry.set(format);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
