package com.pattern.decorate.v2;

/**
 * @author guguoyu
 * @date 2019/5/15
 * @since JDK 1.8
 */
public class EggDecorate extends BatterCakeDecorate {

    public EggDecorate(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
