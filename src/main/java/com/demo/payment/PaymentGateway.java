package com.demo.payment;

public interface PaymentGateway {
    PaymentResult charge(String userId, int amount);
}
