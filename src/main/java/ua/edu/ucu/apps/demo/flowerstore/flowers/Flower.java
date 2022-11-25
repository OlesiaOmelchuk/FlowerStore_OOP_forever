package ua.edu.ucu.apps.demo.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private FlowerColor color;
    @Getter
    private double sepalLength;
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(FlowerColor color, double length, double price){
        this.color = color;
        this.sepalLength = length;
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "A simple flower.";
    }
}
