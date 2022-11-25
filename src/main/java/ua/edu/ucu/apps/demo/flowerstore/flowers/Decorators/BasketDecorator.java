package ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators;

import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Put in basket.";
    }
}
