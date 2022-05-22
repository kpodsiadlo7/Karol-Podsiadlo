package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final int postsQty;
    private final LocalDate birthDayDate;

    public ForumUser(int userID, String userName, char sex, int postsQty, LocalDate birthDayDate) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.postsQty = postsQty;
        this.birthDayDate = birthDayDate;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getPostsQty() {
        return postsQty;
    }

    public LocalDate getBirthDayDate() {
        return birthDayDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", postsQty=" + postsQty +
                ", birthDayDate=" + birthDayDate +
                '}';
    }
}
