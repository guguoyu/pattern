package com.pattern.singleton.serializabled;

import java.io.Serializable;

//实现Serializable
public class SeriableSingleton implements Serializable {
    //私有化构造函数
    private SeriableSingleton(){

    }

    private static SeriableSingleton instance = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return instance;
    }
    //一定要加上这个方法，否则序列化会破坏单例
    public Object readResolve(){
        return instance;
    }
}
