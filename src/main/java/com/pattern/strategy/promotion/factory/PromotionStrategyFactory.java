package com.pattern.strategy.promotion.factory;

import com.pattern.strategy.promotion.*;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(StrategyName.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(StrategyName.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(StrategyName.GROUPBUY, new GroupBuyStrategy());
    }

    private static PromotionStrategy promotionStrategyEmpty = new EmptyStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionName) {

        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionName);

        return promotionStrategy == null ? promotionStrategyEmpty : promotionStrategy;
    }

    private interface StrategyName {
        public String COUPON = "COUPON";
        public String CASHBACK = "CASHBACK";
        public String GROUPBUY = "GROUPBUY";
    }
}
