package ua.edu.ucu.apps.demo.flowerstore.flowers;

public class Rose extends Flower {
    public Rose() {
        setFlowerType(FlowerType.ROSE);
    }
    public Rose(FlowerColor color, double length, double price){
        super(color, length, price);
    }
}
