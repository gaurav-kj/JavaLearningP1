package com.StreamApi;

import java.util.*;
import java.util.stream.Collectors;


public class ListToMap {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();


        productsList.add(new Product(1,"A",25000f));
        productsList.add(new Product(2,"B",30000f));
        productsList.add(new Product(3,"C",28000f));
        productsList.add(new Product(4,"D",28000f));
        productsList.add(new Product(5,"E",90000f));

        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));

        System.out.println(productPriceMap);
    }
}