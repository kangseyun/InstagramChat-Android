package com.trust.instagramclient.Model;


public class LoginModel {
    private int token;
    private String username;
    private boolean sex;

    public LoginModel(int token, String username, boolean sex) {
        this.token = token;
        this.username = username;
        this.sex = sex;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
