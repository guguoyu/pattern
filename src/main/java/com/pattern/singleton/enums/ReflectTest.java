package com.pattern.singleton.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) {
        Class<EnumSingleton> clazz = EnumSingleton.class;
        try {
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            constructor.newInstance("Gu",123);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
