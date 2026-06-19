package com.demo.auth;

public class AuthService {
    private final TokenValidator tokenValidator;

    public AuthService(TokenValidator tokenValidator) {
        this.tokenValidator = tokenValidator;
    }

    public AuthResult authenticate(String bearerToken) {
        if (bearerToken == null || bearerToken.isBlank()) {
            return AuthResult.unauthorized("Missing bearer token");
        }

        boolean valid = tokenValidator.validate(bearerToken);
        if (!valid) {
            return AuthResult.unauthorized("Invalid token");
        }

        return AuthResult.success();
    }
}
