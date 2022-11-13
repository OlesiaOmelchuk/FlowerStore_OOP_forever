package ua.edu.ucu.apps.demo.flowerstore.delivery;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public void deliver(LinkedList items) {
        System.out.println("Order was delivered by post delivery");
    }
}
