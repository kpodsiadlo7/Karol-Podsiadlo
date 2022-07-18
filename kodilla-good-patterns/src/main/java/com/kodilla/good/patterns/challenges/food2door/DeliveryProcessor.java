package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliverService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.MessageService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRespository;

public class DeliveryProcessor {

    private final DeliverService deliverService;
    private final OrderRespository orderRespository;
    private final MessageService messageService;

    public DeliveryProcessor(DeliverService deliverService, OrderRespository orderRespository, MessageService messageService) {
        this.deliverService = deliverService;
        this.orderRespository = orderRespository;
        this.messageService = messageService;
    }

    public void orderProcess(OrderRequest request){
        if (deliverService.process(request.getUser(), request.getProductName(), request.getQty(), request.getPrice())){
            orderRespository.createOrder();
            messageService.sendMessage(request.getUser());
        }
    }
}
