package com.learn.data;

import com.learn.dto.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

@Data
@Slf4j
@Singleton
public class InMemoryStore {

    private final Map<Integer, Product> products = new HashMap<>();
    private final Faker faker = new Faker();

    @PostConstruct
    public void initialise(){
        IntStream.range(0,10)
                .forEach(this::addProduct);
    }

    private void addProduct(int id){
        Product product = new Product(id, faker.coffee().blendName(), Product.Type.COFFEE);
        products.put(id, product);
        log.debug("Added Product: {}",product);
    }
}
