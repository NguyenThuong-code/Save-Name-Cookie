package com.thuong.model;

import org.springframework.web.bind.annotation.ModelAttribute;

public class User {
    private String email;
    private String password;

    @ModelAttribute("user")
    public User setUpUserForm() {
        return new User();
    }
    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
