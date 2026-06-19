package com.demo.user;

public class UserProfile {
    private String userId;
    private String displayName;

    public UserProfile(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
