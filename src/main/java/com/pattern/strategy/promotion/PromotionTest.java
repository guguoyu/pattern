package com.pattern.strategy.promotion;

import com.pattern.strategy.promotion.factory.PromotionStrategyFactory;
import org.apache.commons.lang.StringUtils;

public class PromotionTest {
    public static void main(String[] args) {/*
        PromotionActivity activity618 = new PromotionActivity(new CashbackStrategy());
        activity618.execute();

        PromotionActivity activity1111 = new PromotionActivity(new CouponStrategy());
        activity1111.execute();*/

        //正常业务是这样的
        /*PromotionActivity promotionActivity = null;

        String inputKey = "CASHBACK";
        if (StringUtils.equals(inputKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(inputKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        *//*...*//*
        promotionActivity.execute();*/

        //还有一种写法


        String inputKey = "CA";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(inputKey);
        PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
        promotionActivity.execute();
    }
}
