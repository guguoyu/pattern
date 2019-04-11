package com.pattern.strategy.pay;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    public Integer queryBalance(String uid) {
        return 300;
    }
}
