package com.springboot.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Shop {
    @Autowired
    ShoppingCard shoppingCard;

    public void purchase(){
        shoppingCard.addProductToShoppingCard(new Product(1, "Bread"));
        shoppingCard.addProductToShoppingCard(new Product(2, "Milk"));
        shoppingCard.addProductToShoppingCard(new Product(3, "Butter"));
        shoppingCard.addProductToShoppingCard(new Product(4, "tea"));
    }

}
