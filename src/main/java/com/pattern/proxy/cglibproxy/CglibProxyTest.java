package com.pattern.proxy.cglibproxy;

public class CglibProxyTest {

    public static void main(String[] args) {
        CglibMeipo cglibMeipo = new CglibMeipo();
        Customer instance = (Customer) cglibMeipo.getInstance(Customer.class);
        instance.findLove();
    }
}
