package com.StreamApi;

import java.util.*;
import java.util.stream.Collectors;


public class ListToSet {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        //Adding Products
        productsList.add(new Product(1,"A",25000f));
        productsList.add(new Product(2,"B",30000f));
        productsList.add(new Product(3,"C",28000f));
        productsList.add(new Product(4,"D",28000f));
        productsList.add(new Product(5,"E",90000f));

        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.price < 30000)
                        .map(product->product.price)
                        .collect(Collectors.toSet());
        System.out.println(productPriceList);
    }
}