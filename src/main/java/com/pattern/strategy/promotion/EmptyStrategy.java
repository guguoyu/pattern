package com.pattern.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("空策略");
    }
}
