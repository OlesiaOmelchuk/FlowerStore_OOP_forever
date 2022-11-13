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
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;
    @Getter
    private FlowerType flowerType;

//    public Flower(int id,
//                  double sepalLength,
//                  FlowerColor color,
//                  double price,
//                  FlowerType flowerType) {
//        this.id = id;
//        this.sepalLength = sepalLength;
//        this.color = color;
//        this.price = price;
//        this.flowerType = flowerType;
//    }
//
//    public Flower() {
//        this.id = 0;
//        this.sepalLength = 0;
//        this.color = null;
//        this.price = 0;
//        this.flowerType = null;
//    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return price;
    }
}
