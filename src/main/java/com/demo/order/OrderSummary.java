package com.demo.order;

public class OrderSummary {
    private String orderId;
    private int amount;

    public OrderSummary(String orderId, int amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getAmount() {
        return amount;
    }
}
