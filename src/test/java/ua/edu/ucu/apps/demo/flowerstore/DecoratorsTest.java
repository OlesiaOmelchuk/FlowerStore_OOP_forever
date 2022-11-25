package ua.edu.ucu.apps.demo.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators.BasketDecorator;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators.PaperDecorator;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Decorators.RibbonDecorator;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.demo.flowerstore.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;

public class DecoratorsTest {
    private Flower simpleFlower = new Flower(FlowerColor.RED, 5, 10);

    @Test
    void testPaper(){
        Assertions.assertEquals(simpleFlower.getPrice(), 10);
        Item paperFlower = new PaperDecorator(simpleFlower);
        Assertions.assertEquals(paperFlower.getPrice(), 23);
        Assertions.assertEquals(paperFlower.getDescription(), "A simple flower.Wrapped in paper.");
    }
    @Test
    void testBasket(){
        Assertions.assertEquals(simpleFlower.getPrice(), 10);
        Item basketFLower = new BasketDecorator(simpleFlower);
        Assertions.assertEquals(basketFLower.getPrice(), 14);
        Assertions.assertEquals(basketFLower.getDescription(), "A simple flower.Put in basket.");
    }
    @Test
    void testRibbon(){
        Assertions.assertEquals(simpleFlower.getPrice(), 10);
        Item ribbonFlower = new RibbonDecorator(simpleFlower);
        Assertions.assertEquals(ribbonFlower.getPrice(), 50);
        Assertions.assertEquals(ribbonFlower.getDescription(), "A simple flower.With a beautiful ribbon.");
    }

}
