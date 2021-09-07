package com.StreamApi;

import java.util.*;

public class FilteringAndIterating {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"A",25000f));
        productsList.add(new Product(2,"B",30000f));
        productsList.add(new Product(3,"C",28000f));
        productsList.add(new Product(4,"D",28000f));
        productsList.add(new Product(5,"E",90000f));

        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));
    }
}
