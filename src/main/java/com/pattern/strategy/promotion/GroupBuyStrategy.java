package com.pattern.strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("5人团购，打8折");
    }
}
