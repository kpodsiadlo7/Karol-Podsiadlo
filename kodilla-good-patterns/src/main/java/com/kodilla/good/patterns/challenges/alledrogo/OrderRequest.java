package com.kodilla.good.patterns.challenges.alledrogo;

public class OrderRequest {
    private User user;
    private String productName;
    private int qty;
    private double price;

    public OrderRequest(User user, String productName, int qty, double price) {
        this.user = user;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
