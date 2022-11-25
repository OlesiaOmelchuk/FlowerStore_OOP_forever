package ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators;

import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "With a beautiful ribbon.";
    }
}
