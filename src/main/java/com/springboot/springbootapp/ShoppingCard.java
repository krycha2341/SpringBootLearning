package com.springboot.springbootapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCard {

    public List<Product> productList;

    public void addProductToShoppingCard(Product product){
        productList.add(product);
    }

    public String getList(){
        return productList.toString();
    }


}
