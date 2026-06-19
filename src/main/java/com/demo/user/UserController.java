package com.demo.user;

import com.demo.auth.AuthService;
import com.demo.auth.AuthResult;

public class UserController {
    private final AuthService authService;
    private final UserService userService;

    public UserController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    public UserProfile getProfile(String bearerToken, String userId) {
        AuthResult auth = authService.authenticate(bearerToken);
        if (!auth.isSuccess()) {
            throw new UnauthorizedException(auth.getMessage());
        }
        return userService.getProfile(userId);
    }
}
