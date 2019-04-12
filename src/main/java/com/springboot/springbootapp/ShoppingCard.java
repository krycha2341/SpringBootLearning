package com.springboot.springbootapp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingCard {

    private List<Product> productList;

    public void addProductToShoppingCard(Product product){
        productList.add(product);
    }


}
