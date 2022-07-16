package com.kodilla.good.patterns.challenges.alledrogo;

public class OrderProcessor {
    private final ProductOrderService productOrderService;
    private final ProductOrderRepository productOrderRepository;
    private final MessageService messageService;

    public OrderProcessor(ProductOrderService productOrderService, ProductOrderRepository productOrderRepository, MessageService messageService) {
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
        this.messageService = messageService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(),
                                                      orderRequest.getProductName(),
                                                      orderRequest.getQty(),
                                                      orderRequest.getPrice());

        if(isOrdered){
            messageService.sendMessage(orderRequest.getUser());
            productOrderRepository.createOrder();
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
