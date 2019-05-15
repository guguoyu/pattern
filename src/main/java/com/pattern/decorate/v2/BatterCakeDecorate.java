package com.pattern.decorate.v2;

/**
 * 抽象装饰者
 *
 * @author guguoyu
 * @date 2019/5/15
 * @since JDK 1.8
 */
public abstract class BatterCakeDecorate extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorate(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
