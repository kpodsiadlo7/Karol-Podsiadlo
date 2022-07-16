package com.kodilla.good.patterns.challenges.alledrogo;

public class MainApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRetrieve();

        OrderProcessor processor = new OrderProcessor(new ShoesOrderService(),
                                                      new ShoesOrderRepository(),
                                                      new MailService());
        processor.process(orderRequest);
    }
}
