package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliverService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.ServiceRespositoryConnector;
import com.kodilla.good.patterns.challenges.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.HealthyShop;

public class OrderRequestRetriever {
    private ServiceRespositoryConnector repository;

    public OrderRequestRetriever(ServiceRespositoryConnector repository) {
        this.repository = repository;
    }

    public OrderRequest extraFoodRetrieve() {
        DeliverService deliver = new ExtraFoodShop(repository);
        User user = new User("Antonio", "Banderas");
        String productName = "kluseczki";
        int qty = 33;
        int price = 18;

        return new OrderRequest(price, qty, productName, user, deliver);
    }

    public OrderRequest glutenFreeRetrieve() {
        DeliverService deliver = new GlutenFreeShop(repository);
        User user = new User("Piter", "Nowak");
        String productName = "słony karmel";
        int qty = 1;
        int price = 12;

        return new OrderRequest(price, qty, productName, user, deliver);
    }

    public OrderRequest healthyFoodRetrieve() {
        DeliverService deliver = new HealthyShop(repository);
        User user = new User("Adam", "Małysz");
        String productName = "sandacz";
        int qty = 1;
        int price = 22;

        return new OrderRequest(price, qty, productName, user, deliver);
    }

}
