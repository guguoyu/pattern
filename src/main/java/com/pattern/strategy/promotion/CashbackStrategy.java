package com.pattern.strategy.promotion;

public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("返现活动，金额直接转到支付宝");
    }
}
