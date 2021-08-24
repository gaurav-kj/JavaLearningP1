package com.JavaCollectionFramework.Enum;
import java.util.*;
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumMapE {
    public static void main(String[] args) {
        //create and populate enum map
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.MONDAY, "1");
        map.put(Days.TUESDAY, "2");
        map.put(Days.WEDNESDAY, "3");
        map.put(Days.THURSDAY, "4");
        // print the map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
