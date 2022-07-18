package com.kodilla.good.patterns.challenges.food2door.repositories;

import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRespository;

public class ExtraFoodShopRepository implements OrderRespository {

    @Override
    public void createOrder() {
        System.out.println("EXTRA FOOD SHOP");
    }
}
