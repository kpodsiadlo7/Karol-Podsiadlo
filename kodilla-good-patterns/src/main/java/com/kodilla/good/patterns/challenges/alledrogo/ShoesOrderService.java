package com.kodilla.good.patterns.challenges.alledrogo;

public class ShoesOrderService implements ProductOrderService{

    @Override
    public boolean order(User user, String productName, int qty, double price) {
        System.out.println("Hello " +user.getUserName()
                                    +"\nThank you for shopping in our store."
                                    +"\nYou bought " +productName
                                    +" for: " +price +"$"
                                    +"\nQty:" +qty);
        return true;
    }
}
