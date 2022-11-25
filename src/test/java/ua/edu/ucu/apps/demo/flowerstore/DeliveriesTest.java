package ua.edu.ucu.apps.demo.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.flowerstore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Rose;

import java.util.LinkedList;

public class DeliveriesTest {
    Rose rose = new Rose();
    DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
    PostDeliveryStrategy post = new PostDeliveryStrategy();

    @Test
    void testDHL(){
        LinkedList<Item> order = new LinkedList<>();
        order.add(rose);
        Assertions.assertTrue(dhl.deliver(order));
    }

    @Test
    void testPost(){
        LinkedList<Item> order = new LinkedList<>();
        order.add(rose);
        Assertions.assertTrue(post.deliver(order));
    }
}
