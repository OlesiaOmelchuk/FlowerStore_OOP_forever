package ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators;

import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item newItem){
        item = newItem;
    }
}
