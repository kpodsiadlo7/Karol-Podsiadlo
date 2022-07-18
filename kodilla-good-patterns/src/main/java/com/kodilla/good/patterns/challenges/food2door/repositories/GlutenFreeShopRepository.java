package com.kodilla.good.patterns.challenges.food2door.repositories;

import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRespository;

public class GlutenFreeShopRepository implements OrderRespository {

    @Override
    public void createOrder() {
        System.out.println("GLUTEN FREE SHOP");
    }
}
