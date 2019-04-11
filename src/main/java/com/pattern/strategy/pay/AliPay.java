package com.pattern.strategy.pay;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public Integer queryBalance(String uid) {
        return  200;
    }
}
