package com.JavaCollectionFramework.Maps;

import java.util.*;
public class M1 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"todo1");
        map.put(5,"todo2");
        map.put(2,"todo3");
        map.put(6,"todo4");
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}