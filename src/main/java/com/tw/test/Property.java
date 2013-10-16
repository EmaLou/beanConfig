package com.tw.test;

public class Property {
    private final String passward;
    private final String username;

    public Property(String passward, String username) {
        this.passward = passward;
        this.username = username;
    }
    public String getPassward() {
        return passward;
    }

    public String getUsername() {
        return username;
    }

}
