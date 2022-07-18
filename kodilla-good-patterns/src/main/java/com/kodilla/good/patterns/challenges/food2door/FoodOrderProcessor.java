package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliverService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRespository;
import com.kodilla.good.patterns.challenges.food2door.interfaces.ServiceRespositoryConnector;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderProcessor implements ServiceRespositoryConnector {

    private final HashMap<DeliverService, OrderRespository> serviceOrderRespositoryHashMap = new HashMap<>();

    private void makeOrders(OrderRequest request){
        DeliveryProcessor processor = new DeliveryProcessor(request.getDeliverService(),
        chooseRepository(serviceOrderRespositoryHashMap, request),
        new SmsService());
        processor.orderProcess(request);
    }

    @Override
    public void addRepositoryToList(DeliverService deliverService, OrderRespository orderRespository) {
        serviceOrderRespositoryHashMap.put(deliverService, orderRespository);
    }

    private static OrderRespository chooseRepository(HashMap<DeliverService, OrderRespository> respositoryHashMap,
                                                     OrderRequest request){
        return respositoryHashMap.entrySet().stream()
                .filter(e -> e.getKey() == request.getDeliverService())
                .map(Map.Entry::getValue).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    public FoodOrderProcessor(){
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever(this);
        makeOrders(requestRetriever.extraFoodRetrieve());
        makeOrders(requestRetriever.glutenFreeRetrieve());
        makeOrders(requestRetriever.healthyFoodRetrieve());
    }
}
