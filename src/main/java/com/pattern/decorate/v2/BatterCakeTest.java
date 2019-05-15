package com.pattern.decorate.v2;

/**
 * @author guguoyu
 * @date 2019/5/15
 * @since JDK 1.8
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake;

        batterCake = new BaseBatterCake();

        batterCake = new EggDecorate(batterCake);

        batterCake = new EggDecorate(batterCake);

        batterCake = new SausageDecorate(batterCake);

        System.out.println(batterCake.getMsg() + ",总价：" + batterCake.getPrice());
    }
}
