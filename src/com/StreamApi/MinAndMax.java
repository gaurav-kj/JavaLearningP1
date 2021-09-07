package com.StreamApi;

import java.util.*;

public class MinAndMax {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"A",25000f));
        productsList.add(new Product(2,"B",30000f));
        productsList.add(new Product(3,"C",28000f));
        productsList.add(new Product(4,"D",28000f));
        productsList.add(new Product(5,"E",90000f));

        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productA.price);

        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productB.price);

    }
}