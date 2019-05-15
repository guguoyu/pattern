package com.pattern.decorate.v2;

/**
 * @author guguoyu
 * @date 2019/5/15
 * @since JDK 1.8
 */
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
