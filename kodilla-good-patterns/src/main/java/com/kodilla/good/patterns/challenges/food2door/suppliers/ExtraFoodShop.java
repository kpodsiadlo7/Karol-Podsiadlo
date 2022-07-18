package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.User;
import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliverService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.ServiceRespositoryConnector;
import com.kodilla.good.patterns.challenges.food2door.repositories.ExtraFoodShopRepository;

public class ExtraFoodShop implements DeliverService {

    public ExtraFoodShop(ServiceRespositoryConnector connector) {
        connector.addRepositoryToList(this,new ExtraFoodShopRepository());
    }

    @Override
    public boolean process(User user, String productName, int qty, int price) {
        System.out.println(user.getName() +" " +user.getSurname() +", Thank you for your order "
                +qty +" pieces of "+productName +" for " +price +"$.");
        return true;
    }
}
