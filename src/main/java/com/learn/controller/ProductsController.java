package com.learn.controller;

import com.learn.data.InMemoryStore;
import com.learn.dto.model.Product;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.ArrayList;
import java.util.List;

@Controller("/products")
public class ProductsController {

    private final InMemoryStore inMemoryStore;

    public ProductsController(InMemoryStore inMemoryStore) {
        this.inMemoryStore = inMemoryStore;
    }

    @Get
    public List<Product> listAllProducts(){
        return new ArrayList<>(inMemoryStore.getProducts().values());
    }

}
