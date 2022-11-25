package ua.edu.ucu.apps.demo.flowerstore.flowers;

public class Tulip extends Flower {
    public Tulip() {
        setFlowerType(FlowerType.TULIP);
    }
    public Tulip(FlowerColor color, double length, double price){
        super(color, length, price);
    }
}
