package com.demo.payment;

public class PaymentService {
    private final PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public PaymentResult charge(String userId, int amount) {
        if (userId == null || userId.isBlank()) {
            return PaymentResult.failed("Missing user id");
        }
        if (amount <= 0) {
            return PaymentResult.failed("Amount must be positive");
        }
        return gateway.charge(userId, amount);
    }
}
