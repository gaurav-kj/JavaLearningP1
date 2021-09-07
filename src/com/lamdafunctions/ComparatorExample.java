package com.lamdafunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ComparatorExample{
    public static void main(String[] args) {
        List<MyProduct> list=new ArrayList<MyProduct>();

        list.add(new MyProduct(1,"engine",25000f));
        list.add(new MyProduct(3,"dashboard",300f));
        list.add(new MyProduct(2,"headlamps",150f));

        System.out.println("Sorting on the basis of name...");


        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(MyProduct p:list){
            System.out.println(p);
        }

    }
}

