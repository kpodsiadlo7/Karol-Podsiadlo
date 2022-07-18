package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliverService;

public class OrderRequest {

    private int price;
    private int qty;
    private String productName;
    private User user;
    private DeliverService deliverService;

    public OrderRequest(int price, int qty, String productName, User user, DeliverService deliverService) {
        this.price = price;
        this.qty = qty;
        this.productName = productName;
        this.user = user;
        this.deliverService = deliverService;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getProductName() {
        return productName;
    }

    public User getUser() {
        return user;
    }

    public DeliverService getDeliverService() {
        return deliverService;
    }
}
