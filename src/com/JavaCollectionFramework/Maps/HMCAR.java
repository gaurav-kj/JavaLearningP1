package com.JavaCollectionFramework.Maps;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public String toString() {
        return
                "id=" + id +
                " brand='" + brand + '\'' +
                " model='" + model + '\'' +
                " year='" + year + '\'' +
                " qty=" + qty ;
    }
}
public class HMCAR {
    public static void main(String[] args) {
        Map<Integer,Car> map=new HashMap<Integer,Car>();
        Car b1=new Car(1,"Tata","Harrier","2021",8);
        Car b2=new Car(2,"Mahindra","Thar","2021",4);
        Car b3=new Car(3,"jeep","Compass","2021",6);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        for(Car c:map.values()){
            System.out.println(c);
        }

        for(Map.Entry<Integer, Car> entry:map.entrySet()){
            int key=entry.getKey();
            Car c=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(c);
        }
    }
}
