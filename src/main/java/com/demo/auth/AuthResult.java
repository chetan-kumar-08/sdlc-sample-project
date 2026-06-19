package com.demo.auth;

public class AuthResult {
    private final boolean success;
    private final String message;

    private AuthResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static AuthResult success() {
        return new AuthResult(true, "Authenticated");
    }

    public static AuthResult unauthorized(String message) {
        return new AuthResult(false, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
