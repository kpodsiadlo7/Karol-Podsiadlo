package com.kodilla.good.patterns.challenges.food2door.interfaces;

import com.kodilla.good.patterns.challenges.food2door.User;

public interface DeliverService {

    boolean process(User user,String productName,int qty, int price);
}
