package com.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class FilteringUsingStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"A",25000f));
        productsList.add(new Product(2,"B",30000f));
        productsList.add(new Product(3,"C",28000f));
        productsList.add(new Product(4,"D",28000f));
        productsList.add(new Product(5,"E",90000f));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 20000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}
