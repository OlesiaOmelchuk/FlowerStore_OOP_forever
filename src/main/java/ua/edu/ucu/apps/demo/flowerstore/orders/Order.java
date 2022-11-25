package ua.edu.ucu.apps.demo.flowerstore.orders;

import ua.edu.ucu.apps.demo.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;
import ua.edu.ucu.apps.demo.flowerstore.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentType) {
        this.payment = paymentType;
    }

    public void setDeliveryStrategy(Delivery deliveryType) {
        this.delivery = deliveryType;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        System.out.println("Type of delivery: " + delivery.getClass());
        System.out.println("Type of payment: " + payment.getClass());
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
