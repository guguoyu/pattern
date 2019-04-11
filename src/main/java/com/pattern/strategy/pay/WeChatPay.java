package com.pattern.strategy.pay;

public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public Integer queryBalance(String uid) {
        return 400;
    }
}
