package ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators;

import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;

public class PaperDecorator extends ItemDecorator{

    public PaperDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "\nWrapped in paper";
    }
}
