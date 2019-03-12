package com.pattern.singleton.lazy;

public class LazySimpleSingleTon {

    private static LazySimpleSingleTon lazySingleTon = null;

    private LazySimpleSingleTon() {

    }

    public static  LazySimpleSingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySimpleSingleTon();
        }
        return lazySingleTon;
    }
}
