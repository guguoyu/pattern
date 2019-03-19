package com.pattern.proxy.staticd;

public class Father implements Object {

    private Object person;

    public Father(Object target) {
        this.person = target;
    }

    @Override
    public void findLove() {
        before();
        this.person.findLove();
        after();
    }

    private void after() {
        System.out.println("双方满意，互换微信");
    }

    private void before() {
        System.out.println("物色对象");
    }
}
