package com.JavaCollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Car{
    int id;
    String brand,model,year;
    int qty;

   Car(int id ,String brand,String model, String year, int qty){
       this.id = id;
       this.brand = brand;
       this.year = year;
       this.model = model;
       this.qty=qty;
   }
}
public class ArrayList10 {
    public static void main(String[] args) {
        List<Car> list=new ArrayList<Car>();
        Car b1=new Car(1,"Tata","Harrier","2021",8);
        Car b2=new Car(2,"Mahindra","Thar","2021",4);
        Car b3=new Car(3,"jeep","Compass","2021",6);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Car b:list){
            System.out.println(b.id+" "+b.brand+" "+b.year+" "+b.model+" "+b.qty);
        }
    }
}
