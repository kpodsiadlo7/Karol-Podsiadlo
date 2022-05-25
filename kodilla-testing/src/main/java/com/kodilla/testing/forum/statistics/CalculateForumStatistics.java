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

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numbersOfUsers = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsPerUser = calculatePostsAvgPerUser();
        averageCommentsPerUser = calculateCommentsAvgPerUser();
        averageCommentsPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(numbersOfUsers>0){
            return (double)postsQuantity/numbersOfUsers;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(numbersOfUsers>0){
            return (double)commentsQuantity/numbersOfUsers;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(postsQuantity>0){
            return (double)commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum statistics:");
        System.out.println("Users quantity: [" + numbersOfUsers +"]");
        System.out.println("Posts quantity: [" + postsQuantity +"]");
        System.out.println("Comments quantity: [" + commentsQuantity +"]");
        System.out.println("Posts average per user: [" + averagePostsPerUser +"]");
        System.out.println("Comments average per user: [" + averageCommentsPerUser +"]");
        System.out.println("Comments average per post: [" + averageCommentsPerPost +"]");
    }
}
