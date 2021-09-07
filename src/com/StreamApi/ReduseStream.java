package com.StreamApi;

import java.util.*;

public class ReduseStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"Apple",250f));
        productsList.add(new Product(2,"Mango",300f));
        productsList.add(new Product(3,"Grapes",280f));
        productsList.add(new Product(4,"Guava",280f));
        productsList.add(new Product(5,"Banana",900f));

        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);

        System.out.println(totalPrice);


    }
}