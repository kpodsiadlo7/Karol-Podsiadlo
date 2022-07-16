package com.kodilla.good.patterns.challenges.alledrogo;

public class User {
    private final String userName;
    private final String userSurname;

    public User(String userName, String realName) {
        this.userName = userName;
        this.userSurname = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return userSurname;
    }
}
