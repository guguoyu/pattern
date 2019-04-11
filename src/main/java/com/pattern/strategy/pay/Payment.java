package com.pattern.strategy.pay;

public abstract class Payment {

    public abstract String getName();

    public abstract Integer queryBalance(String uid);

    public PayState pay(String uid, double amount) {
        Integer balance = queryBalance(uid);
        if (balance < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功", "支付金额:" + amount);
    }
}
