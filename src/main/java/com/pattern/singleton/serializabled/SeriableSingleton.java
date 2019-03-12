package com.pattern.singleton.serializabled;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private SeriableSingleton(){

    }

    private static SeriableSingleton instance = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
