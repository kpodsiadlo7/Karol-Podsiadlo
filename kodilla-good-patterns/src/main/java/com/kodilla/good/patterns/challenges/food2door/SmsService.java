package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.interfaces.MessageService;

public class SmsService implements MessageService {

    @Override
    public void sendMessage(User user) {
        System.out.println("Status: Ordered\n");
    }
}
