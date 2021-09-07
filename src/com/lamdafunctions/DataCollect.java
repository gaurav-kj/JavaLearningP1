package com.lamdafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class MyProduct {
    int id;
    String name;
    float price;
    public MyProduct(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class DataCollect{
    public static void main(String[] args) {
        List<MyProduct> list=new ArrayList<MyProduct>();
        list.add(new MyProduct(1,"tata",17000f));
        list.add(new MyProduct(3,"mahindra",65000f));
        list.add(new MyProduct(2,"kia",25000f));
        list.add(new MyProduct(4,"jeep",15000f));
        list.add(new MyProduct(5,"honda",26000f));
        list.add(new MyProduct(6,"MG",19000f));


        Stream<MyProduct> filtered_data = list.stream().filter(p -> p.price > 20000);


        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}