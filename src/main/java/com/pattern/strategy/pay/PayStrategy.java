package com.pattern.strategy.pay;


import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    private static String ALI_PAY = "AliPay";

    private static String JD_PAY = "JDPay";

    private static String WECHART_PAY = "WeChatPay";

    private static String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> PAY_STRATEGY_MAP = new HashMap<>();

    static {
        PAY_STRATEGY_MAP.put(ALI_PAY, new AliPay());
        PAY_STRATEGY_MAP.put(JD_PAY, new JDPay());
        PAY_STRATEGY_MAP.put(WECHART_PAY, new WeChatPay());
    }

    public Payment getPayment(String payMode) {
        Payment payment = PAY_STRATEGY_MAP.get(payMode);
        return payment == null ? PAY_STRATEGY_MAP.get(DEFAULT_PAY) : payment;
    }
}
