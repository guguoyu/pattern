package com.pattern.strategy.pay;

public class PayState {
    private int code;

    private Object data;

    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "支付状态=" + code +
                ", 交易详情=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
