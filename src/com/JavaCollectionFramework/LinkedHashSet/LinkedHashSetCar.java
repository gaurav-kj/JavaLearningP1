package com.JavaCollectionFramework.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

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
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", qty=" + qty +
                '}';
    }
}
public class LinkedHashSetCar {
    public static void main(String[] args) {
        Set<Car> Carlist=new LinkedHashSet<>();
        Car b1=new Car(1,"Tata","Harrier","2021",8);
        Car b2=new Car(2,"Mahindra","Thar","2021",4);
        Car b3=new Car(3,"jeep","Compass","2021",6);
        Car b4=new Car(4,"Tata","Harrier","2022",8);

        Carlist.add(b1);
        Carlist.add(b2);
        Carlist.add(b3);
        Carlist.add(b4);
        for(Car car:Carlist){
            System.out.println(car);
        }
    }
}
