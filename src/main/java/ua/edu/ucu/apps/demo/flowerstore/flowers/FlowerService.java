package ua.edu.ucu.apps.demo.flowerstore.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
//        final int LENGTH = 4, PRICE = 10;
//        return List.of(
//                new Flower(LENGTH, FlowerColor.RED, PRICE, FlowerType.ROSE),
//                new Flower(LENGTH, FlowerColor.BLUE, PRICE, FlowerType.TULIP));
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
