package com.kodilla.good.patterns.challenges.alledrogo;

public class OrderRequestRetriever {

    public OrderRequest orderRetrieve(){
        User user = new User("Max","Kolonko");
        String productName = "Nike Air Jordan";
        int qty = 2;
        double price = 399.99d;

        return new OrderRequest(user,productName,qty,price);
    }
}
