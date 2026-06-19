package com.demo.payment;

public class PaymentResult {
    private final boolean success;
    private final String message;

    private PaymentResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static PaymentResult success() {
        return new PaymentResult(true, "Payment successful");
    }

    public static PaymentResult failed(String message) {
        return new PaymentResult(false, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
