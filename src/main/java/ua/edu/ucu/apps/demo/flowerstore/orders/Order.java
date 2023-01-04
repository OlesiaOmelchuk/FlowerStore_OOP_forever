package ua.edu.ucu.apps.demo.flowerstore.orders;

import ua.edu.ucu.apps.demo.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;
import ua.edu.ucu.apps.demo.flowerstore.payments.Payment;
import ua.edu.ucu.apps.demo.flowerstore.users.AppUser;
import ua.edu.ucu.apps.demo.flowerstore.users.Status;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private List<AppUser> users;
    private Status status;
    private boolean delivered;
    private boolean paid;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
        this.status = Status.UNPROCESSED;
        this.delivered = false;
        this.paid = false;
    }

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
        System.out.println("Type of payment: " + payment.getClass());
        paid = payment.pay(calculateTotalPrice());
        System.out.println("Type of delivery: " + delivery.getClass());
        delivered = delivery.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(AppUser user) {
        users.add(user);
    }

    public void removeUser(AppUser user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (AppUser user : users) {
            user.update(status);
        }
    }

    public void order() {
        if (paid && !delivered) {
            status = Status.PROCESSED;
        } else if (paid && delivered) {
            status = Status.DELIVERED;
        } else {
            status = Status.UNPROCESSED;
        }
        notifyUsers();
    }
}
