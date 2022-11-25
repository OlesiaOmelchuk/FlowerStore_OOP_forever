package ua.edu.ucu.apps.demo.flowerstore.delivery;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public boolean deliver(LinkedList items) {
        System.out.println("Order was delivered by DHL delivery");
        return true;
    }
}
