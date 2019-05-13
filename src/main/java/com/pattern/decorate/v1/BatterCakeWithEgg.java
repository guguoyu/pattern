package com.pattern.decorate.v1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    //加一个鸡蛋1块钱
    public int getPrice() {
        return super.getPrice()+1;
    }
}
