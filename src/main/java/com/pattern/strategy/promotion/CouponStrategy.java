package com.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("领取优惠券，课程的价格直接减去优惠券价格");
    }
}
