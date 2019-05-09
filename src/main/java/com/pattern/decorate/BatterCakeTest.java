package com.pattern.decorate;

public class BatterCakeTest {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + ",总价格：" + batterCake.getPrice());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg()+",总价格："+batterCakeWithEgg.getPrice());

        BatterCakeWithEggAndSausage batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg()+",总价格："+batterCakeWithEggAndSausage.getPrice());
    }
}
