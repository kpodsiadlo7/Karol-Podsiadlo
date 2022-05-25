package com.kodilla.testing.forum.statistics;

public class CalculateForumStatistics {

    private int numbersOfUsers;
    private int commentsQuantity;
    private int postsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }


    void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();
        commentsQuantity = statistics.commentsCount();
        postsQuantity = statistics.postsCount();

        if(numbersOfUsers > 0) {
            averagePostsPerUser = (double) postsQuantity / numbersOfUsers;
            averageCommentsPerUser = (double) commentsQuantity / numbersOfUsers;
        } else {
            postsQuantity = 0;
            commentsQuantity = 0;
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }

        if(postsQuantity >0) {
            averageCommentsPerPost = (double) commentsQuantity / postsQuantity;
        } else {
            averageCommentsPerPost = 0;
            averageCommentsPerUser = 0;
            commentsQuantity = 0;
        }
    }

}
