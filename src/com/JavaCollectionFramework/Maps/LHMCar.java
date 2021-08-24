package com.JavaCollectionFramework.Maps;
import java.util.*;
public class LHMCar {
    public static void main(String[] args) {
        Map<Integer,Car> map= new LinkedHashMap<>();
        Car b1=new Car(1,"Tata","Harrier","2021",8);
        Car b2=new Car(2,"Mahindra","Thar","2021",4);
        Car b3=new Car(3,"jeep","Compass","2021",6);
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        for(Map.Entry<Integer, Car> entry:map.entrySet()){
            int key=entry.getKey();
            Car b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b);
        }
    }
}
