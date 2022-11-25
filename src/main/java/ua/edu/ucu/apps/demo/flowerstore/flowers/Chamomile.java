package ua.edu.ucu.apps.demo.flowerstore.flowers;

public class Chamomile extends Flower {
    public Chamomile() {
        setFlowerType(FlowerType.CHAMOMILE);
    }
    public Chamomile(FlowerColor color, double length, double price){
        super(color, length, price);
    }
}
