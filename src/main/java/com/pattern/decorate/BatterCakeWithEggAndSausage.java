package com.pattern.decorate;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个香肠";
    }

    @Override
    //加完鸡蛋在加一个香肠的价格
    public int getPrice() {
        return super.getPrice()+2;
    }
}
