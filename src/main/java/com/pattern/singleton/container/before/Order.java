package com.pattern.singleton.container.before;

import java.math.BigDecimal;

public class Order {

    private String orderId;

    private BigDecimal amount;

    private String userId;

    private Integer payMode;

    public Order(String orderId, BigDecimal amount, String userId, Integer payMode) {
        this.orderId = orderId;
        this.amount = amount;
        this.userId = userId;
        this.payMode = payMode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPayMode() {
        return payMode;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }
}
