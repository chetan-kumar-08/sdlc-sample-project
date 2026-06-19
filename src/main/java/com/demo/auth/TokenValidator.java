package com.demo.auth;

public interface TokenValidator {
    boolean validate(String token);
}
