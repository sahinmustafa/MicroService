package com.my.accountserver.domain.user;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private String username;
    private String email;
    private String password;

    public User(String username) {
        this.username = username;
        this.password = UUID.randomUUID().toString();
        this.email = username + "@mail.com";
    }
}
