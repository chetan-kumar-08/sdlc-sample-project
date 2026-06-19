package com.demo.user;

public interface UserRepository {
    UserProfile findProfile(String userId);
}
